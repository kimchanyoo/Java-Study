package Chapter3;

public class Programming7_3 {

	public static void main(String[] args) {
		System.out.print("2부터 100사이의 모든 소수: ");
		int count = 0;
		for (int i = 2; i < 101; i++) {
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
}
