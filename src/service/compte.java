package service;

public class compte {
	public int code;
	public double solde ;
	public int dateCreation;
	public compte(int code , double solde , int dateCreation) {
		this.code=code;
		this.solde=solde;
		this.dateCreation=dateCreation;
		
				
	}
public int getCode(int code) {
	return code;
}
public double getSolde(int sold) {
	return solde;
}
public int getDateCreation(int dateCreation) {
	return dateCreation;
}
public void setCode(int code) {
	this.code=code;
	
}
public void setSolde(int sold) {
	this.solde=sold;
	
}
public void setDateCreation(int dateCreation) {
	this.dateCreation=dateCreation;
	
}




}
