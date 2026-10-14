package ma.polymorphisme.ex1;

public class Carre extends Forme {
	
	private double cote ;

	public Carre(String couleur, double cote) {
		super(couleur);
		this.cote = cote;
	}

	@Override
	public void dessiner() {
		System.out.println(" \n Dessiner un carre de couleur :  " + couleur + " et de cote : " + cote );
	}

	@Override
	public double aire() {
		
		return cote*cote;
	}
	
	

}
