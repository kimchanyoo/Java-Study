import java.util.Scanner;

public class Programming1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		int number = s.nextInt();
		
		System.out.println((number/10) + "�ڽ��� �ʿ��ϰ� " + (number%10) + "���� �����ϴ�.");
	}

}
