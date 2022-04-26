package Chapter4;

public class Programming3_4 {

	public static void main(String[] args) {
		Song s1 = new Song("Outward Bound","Nana",180);
		Song s2 = new Song("Jambalya","Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		System.out.println("title: "+ s1.title + " artist: "+s1.artist+" length: "+s1.length);
		System.out.println("title: "+ s2.title + " artist: "+s2.artist+" length: "+s2.length);
		System.out.println("title: "+ s3.title + " artist: "+s3.artist+" length: "+s3.length);
		System.out.println("title: "+ s4.title + " artist: "+s4.artist+" length: "+s4.length);
	}
}
