package Chapter3;

public class Programming6_3 {

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (3 * i + 10 * j == 100) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
	}

}
