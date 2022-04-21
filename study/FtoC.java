import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("1. È­¾¾->¼·¾¾");
		System.out.println("2. ¼·¾¾->È­¾¾");
		System.out.println("======================");

		System.out.print("¹øÈ£¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		int x = s.nextInt();
		if (x == 1) {
			System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
			double F = s.nextDouble();
			double c_temp = (5.0 / 9.0) * (F - 32);
			System.out.println("¼·¾¾¿Âµµ´Â " + c_temp);
		} else if (x == 2) {
			System.out.print("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
			double C = s.nextDouble();
			double f_temp = 9.0 / 5.0 * C + 32;
			System.out.println("È­¾¾¿Âµµ´Â " + f_temp);
		}
	}

}
