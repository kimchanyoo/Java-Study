import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("높이를 입력하시오: ");
		int n = s.nextInt();

		for (int i = 1; i < n / 2 + 2; i++) {
			for (int j = n / 2; j > i - 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n / 2; i > 0; i--) {
			for (int j = 0; j < n / 2 - i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = i + i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
