/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
import java.util.Scanner;

public class Progremming9_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����� ���� ����: ");
		int number = s.nextInt();
		int a = 0, b =1, c = 0;
		if(number == 1) {      // ����� ���� ������ 1�� �϶� 
			System.out.println(a);
		}
		else if(number ==2) {    //����� ���� ������ 2�� �϶�
			System.out.println(a + " " + b);
		}
		else if(number >2) {
			System.out.print(a + " " + b);    // 0 �� 1�� ������ �����̹Ƿ� �̸� ����Ѵ�
			for(int i = 0;i < number-2; i++) {  // 0�� 1�� �տ��� ����߱� ������ number-3���� �ݺ���Ų��
				c = a + b;  //c�� �� 2���� ������ �մϴ�
				System.out.print(" " + c);
				a = b;  //���� ������ ���� a�� b���� �ִ´�
				b = c;  // ���� ������ ���� b�� c���� �ִ´�
			}
		}
		else {
			System.out.println("���� ������ �߸��Ǿ����ϴ�.");
		}
		
	}

}
