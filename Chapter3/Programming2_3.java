/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
import java.util.Scanner;

public class Programming2_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String oper = s.nextLine(); // ������ �Է�
		System.out.println("�ǿ����� 2�� �Է��ϼ���: ");
		int x = s.nextInt();  //�ǿ����� 1
		int y = s.nextInt();  //�ǿ����� 2
		if(oper.equals("+")) {  //���ڿ��� �񱳴� .equals�� ����Ѵ�.
			System.out.println((float)x + "+" + (float)y + " = " + (float)(x+y));
		}
		else if(oper.equals("-")) {
			System.out.println((float)x + "-" + (float)y + " = " + (float)(x-y));
		}
		else if(oper.equals("*")) {
			System.out.println((float)x + "*" + (float)y + " = " + (float)(x*y));
		}
		else if(oper.equals("/")) {
			if(y != 0) { // �и� ���� 0���� Ȯ�� 
				System.out.println((float)x + "/" + (float)y + " = " + (float)(x/y));
			}
			else {
				System.out.println("�и� 0�Դϴ�.");
			}
		}
	}

}
