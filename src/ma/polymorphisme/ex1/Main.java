package ma.polymorphisme.ex1;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		
		// Preciser le format du nbre  //
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		//Construction de tableau heterogene de forme //
		
		Forme[] formes = new Forme[] {
				new Cercle("Rouge", 5.0),
				new Rectangle("Bleu", 4.0, 3.0),
				new Triangle("Vert", 6.0, 2.5), 
				new Forme("Noir")

		};
		
		for(Forme f: formes) {
			f.dessiner();// appel dynamique depuis la classe instanciee 
		System.out.println(" Aire = " + df .format(f.aire()) );
		
		}
		
	}

}
