package service;

import java.util.List;

public class BanqueService {
	List<compte> comptes;
	
	
	
	public double conversion(double montant) {
		return montant * 0.80;
		
	}
	
	public compte getCompte(int i) {
		return comptes.get(i);
		
	}
	public List<compte> getComptes(){
		return comptes;
		
	}
}
