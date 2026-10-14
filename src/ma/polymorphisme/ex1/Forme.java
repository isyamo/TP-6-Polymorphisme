package ma.polymorphisme.ex1;

public class Forme {

	protected String couleur;

	// Constructeur//

	public Forme(String couleur) {

		this.couleur = couleur;
	}

	public void dessiner() {

		System.out.println("\n Dessiner une forme de couleur " + couleur);
	}

	public double  aire() {
		
		return 0.0;
	}	
	
	
}
