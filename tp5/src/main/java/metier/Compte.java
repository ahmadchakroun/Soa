package metier;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.glassfish.external.amx.BootAMXMBean;

import java.util.*;
@XmlRootElement
// Annotation pour spécifier comment la classe doit être sérialisée en XML
@XmlAccessorType(XmlAccessType.FIELD)
// Annotation pour définir la classe comme un service web avec le nom "compteBancaire"
@WebService(name = "compteBancaire")
public class Compte {

    private int code;
    private double solde ;

    @XmlTransient
    // Annotation pour indiquer que la variable ne doit pas être sérialisée en XML
    private Date date;
    // Constructeur avec paramètres pour initialiser les variables membres
    public Compte(int code , double solde , Date date)  {

        this.code=code;
        this.solde=solde;
        this.date=date;
    }
    // Constructeur par défaut nécessaire pour la sérialisation XML
    public Compte()  {
    }
    // Méthode annotée comme une opération web avec le nom "Affichage"
    @WebMethod(operationName = "Affichage")
    public String toString() {
        return "code : "+this.code+ "solde : "+this.solde+" date cration " +this.date;
    }
}