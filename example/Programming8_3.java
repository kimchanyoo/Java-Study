/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
public class Programming8_3 {

	public static void main(String[] args) {
		int count = 0;   // �ﰢ�� ������ �� ���� ����
		for(int i =1;i < 100; i++) {    
			for(int j =1;j < 100;j++) {
				for(int k =1;k < 100;k++) {
					if(i*i + j*j == k*k) {   //a^2 + b^2 = c^2�� �����ϴ��� Ȯ��
						System.out.println(i + " " + j + " " + k );
						count = count +1;
					}
				}
			}
		}
		System.out.println("�� ���� ���̰� 100���� ���� �ﰢ���� ������ " + count + "���̴�.");  //�� ���� ���̰� 100���� ���� �ﰢ�� ���� ���
	}

}
