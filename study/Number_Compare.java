import java.util.Scanner;

public class Number_Compare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 1�� �Է��Ͻÿ�: ");
		int x = s.nextInt();
		System.out.print("���� 2�� �Է��Ͻÿ�: ");
		int y = s.nextInt();

		System.out.println((x > y) ? "ū �� = " + x + " ���� �� = " + y : "ū �� = " + y + " ���� �� = " + x);
	}

}
