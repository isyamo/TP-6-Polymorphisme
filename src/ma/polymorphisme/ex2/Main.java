package ma.polymorphisme.ex2;

public class Main {

	public static void main(String[] args) {

		MediaLibrary lib = new MediaLibrary();

		lib.add(new Audio("Podcast Java", 1800));
		lib.add(new Video("Tutoriel UML", 900, "1080p"));
		lib.add(new LiveStream("Concert en direct", "http://live.example.com"));
		lib.add(new Audio("Musique Classique", 2400));
		lib.add(new Podcast("WeAreNetflix",5400,"Lyle Troxell"));

		lib.playAll();
		lib.stopAll();
		System.out.println();
		System.out.println("Durée totale (sec) : " + lib.totalDuration());
	}
	
	

}
