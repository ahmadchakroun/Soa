package Service;
import metier.Compte;

import java.util.*;
import jakarta.jws.*;

@WebService(name = "CalculWS")
//Annotation pour le class
public class BanqueService {

    public Compte compte;
    public ArrayList<Compte>Listecompte;

    public BanqueService() {
        this.Listecompte = new ArrayList<Compte>();
    }
    // Initialisation de la liste de comptes dans le constructeur
    // Méthode annotée comme une opération web avec le nom "Conversion"
    @WebMethod(operationName="Conversion")
    public double conversion(@WebParam (name="vmontant")  double montant) {
        return montant*3.36;
    }
    // Méthode annotée comme une opération web avec le nom "Compte1"
    @WebMethod(operationName = "Compte1")
    public Compte getcompte(int code) {
        return new Compte(code,0,new Date());
    }
    @WebMethod(operationName = "RetourneCompte")
    public ArrayList<Compte> getComptes() {
        // Crée une liste de comptes, les ajoute à la liste, puis retourne la liste
        ArrayList<Compte> listeCompte = new ArrayList<Compte>();
        listeCompte.add(new Compte(10, 5000, new Date()));
        listeCompte.add(new Compte(11, 1500, new Date()));
        return listeCompte;
    }

}