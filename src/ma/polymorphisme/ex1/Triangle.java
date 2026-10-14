package ma.polymorphisme.ex1;

public class Triangle extends Forme {

	private double base, hauteur;

	public Triangle(String couleur, double base, double hauteur) {
		super(couleur);
		this.base = base;
		this.hauteur = hauteur;
	}

	@Override
	public void dessiner() {
		System.out.println("\n Dessiner un triangle de couleur " + couleur + ", base = " + base + ", hauteur = " + hauteur);
	}

	@Override
	public double aire() {
		
		return (base*hauteur)/2.0;
	}

	
	
}
