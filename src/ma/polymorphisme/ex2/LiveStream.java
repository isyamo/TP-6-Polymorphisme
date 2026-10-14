package ma.polymorphisme.ex2;

public class LiveStream extends Media {

	private String url;

	public LiveStream(String titre, String url) {
		super(titre);
		this.url = url;
	}

	@Override
	public void lire() {
		System.out.println(" Demarrage du flux en direct : " + titre + " -- " + url);
	}

	@Override
	public int getDuree() {

		return -1;
	}

	@Override
	public void stop() {
		System.out.println(" Arret du flux : " + titre + " -- " + url );
	}
	
	

}
