package Chapter4;

public class Song {
	String title;
	String artist;
	int length;
	
	public Song(String t, String a, int l) {
		title = t;
		artist = a;
		length = l;
	}
	public Song(String t, String a) {
		title = t;
		artist = a;
	}
	public Song(String t) {
		title =t;
	}
	public Song() {
		this("Outward","Nana",180);
	}
}
