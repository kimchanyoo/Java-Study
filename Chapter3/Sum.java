
package Chapter3;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 0, sum = 0;
		while (n != -1) {
			sum = sum + n;
			System.out.print("������ �Է��Ͻÿ�: ");
			n = s.nextInt();
		}
		System.out.println("������ ���� " + sum + " �Դϴ�.");
	}
}
