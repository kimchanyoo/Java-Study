import java.util.Scanner;

public class RockPapaerSissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2): ");
		int num = s.nextInt();

		int computer = (int) (java.lang.Math.random() * 3);
		if (num == computer) {
			System.out.println("�ΰ�: " + num + " ��ǻ��: " + computer + " �ΰ��� ��ǻ�Ͱ� ���");
		} else if (computer - num < 0) {
			System.out.println("�ΰ�: " + num + " ��ǻ��: " + computer + " �ΰ��� ��ǻ�͸� �̱�");
		} else {
			System.out.println("�ΰ�: " + num + " ��ǻ��: " + computer + " ��ǻ�Ͱ� �ΰ��� �̱�");
		}

	}
}