/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
public class Exercise2_3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {      // i�� 0, 1, 2�� ����
			switch(i) {
			case 0: break;  
			case 1: System.out.print("one "); // i�� 1�� ��� ��������� break�� ���� ������ ���� case 2�� case 3�� �����Ŵ
			case 2: System.out.print("two ");
			case 3: System.out.print("three ");
			}
		}
		System.out.println("done");  //for�� ���� ���

	}
}
