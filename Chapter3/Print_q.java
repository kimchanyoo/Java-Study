package Chapter3;

import java.util.Scanner;

public class Print_q {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 0, sum = 0;
		String alp = "s";
		do {
			n = s.nextInt();
			sum = sum + n;
			System.out.print("문자를 입력하시오: ");
			alp = s.next();
			if (alp.equals("q"))
				break;
		} while (true);
		System.out.println(sum);
	}
}
