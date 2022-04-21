import java.util.Scanner;

public class Number_Compare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 1을 입력하시오: ");
		int x = s.nextInt();
		System.out.print("숫자 2을 입력하시오: ");
		int y = s.nextInt();

		System.out.println((x > y) ? "큰 값 = " + x + " 작은 값 = " + y : "큰 값 = " + y + " 작은 값 = " + x);
	}

}
