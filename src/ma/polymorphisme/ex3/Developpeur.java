package ma.polymorphisme.ex3;

public class Developpeur extends Personne {

	public Developpeur(String nom, double salaireBase, int anciennete) {
		super(nom, salaireBase, anciennete);
	}

	@Override
	public double calculerSalaire() {
		double prime = anciennete *200;
		return (salaireBase * 1.10) + prime;
	}

}
