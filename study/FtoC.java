import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("1. ȭ��->����");
		System.out.println("2. ����->ȭ��");
		System.out.println("======================");

		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
		int x = s.nextInt();
		if (x == 1) {
			System.out.print("ȭ���µ��� �Է��Ͻÿ�: ");
			double F = s.nextDouble();
			double c_temp = (5.0 / 9.0) * (F - 32);
			System.out.println("�����µ��� " + c_temp);
		} else if (x == 2) {
			System.out.print("�����µ��� �Է��Ͻÿ�: ");
			double C = s.nextDouble();
			double f_temp = 9.0 / 5.0 * C + 32;
			System.out.println("ȭ���µ��� " + f_temp);
		}
	}

}
