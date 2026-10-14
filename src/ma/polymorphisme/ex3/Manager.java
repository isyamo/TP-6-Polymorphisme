package ma.polymorphisme.ex3;

public class Manager extends Personne  {

	public Manager(String nom, double salaireBase , int anciennete) {
		super(nom, salaireBase, anciennete);
	}

	@Override
	public double calculerSalaire() {
		
		double prime=anciennete*300.0;
		return (salaireBase*1.30)+prime;
	}
	
	

}
