package Chapter3;

import java.util.Scanner;

public class Factoirial {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = s.nextInt();
		long sum= 1;
		for(int i = 1; i<num+1;i++) {
			sum = sum*i;
		}
		System.out.printf("%d!�� %d�Դϴ�.",num,sum);
	}
}
