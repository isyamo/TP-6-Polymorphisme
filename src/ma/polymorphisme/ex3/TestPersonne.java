package ma.polymorphisme.ex3;

import java.util.ArrayList;
import java.util.List;

public class TestPersonne {

	public static void main(String[] args) {
		List<Personne> equipe = new ArrayList<>();
		equipe.add(new Developpeur("Ali", 2000, 10));
		equipe.add(new Manager("Hamid", 3000, 6));
		equipe.add(new Developpeur("Hanane", 2200, 4));

		// Affiche chaque personne via la méthode générique
		Utils.listerPersonnes(equipe);
	}

}
