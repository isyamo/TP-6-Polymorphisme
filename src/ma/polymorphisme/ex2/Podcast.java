package ma.polymorphisme.ex2;

public class Podcast extends Audio {
	
	private  String hote ;

	public Podcast(String titre, int duree, String hote) {
		super(titre, duree);
		this.hote = hote;
	}

	@Override
	public void lire() {
		System.out.println(" Lecture du podcast : " + titre + " Anime par " + hote   );
	}

	

	@Override
	public void stop() {
		System.out.println(" Arret du podcast : " + titre );
	}
	
	

}
