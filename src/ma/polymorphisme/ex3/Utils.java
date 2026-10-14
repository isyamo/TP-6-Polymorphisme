package ma.polymorphisme.ex3;

import java.util.List;

public class Utils {
	
	// parcourir une liste de personnes (ou de ses sous-classes) pour afficher les informations de chaque objet de manière automatique //
	
	public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            p.affiche();
        }
    }	

}
