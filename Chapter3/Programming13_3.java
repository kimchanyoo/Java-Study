/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
public class Programming13_3 {

	public static void main(String[] args) {
		String[] pattern = {"Clubs", "Diamonds", "Hearts", "Spades"};  //card���� �迭 ����
		String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};  //ī�� ��ȣ �迭 ����
		for(int i = 0;i < 5;i++) {  //5ȸ �ݺ�
			int p_Rand = (int)(Math.random()*4); // ���� �������� ����
			int n_Rand = (int)(Math.random()*13);  //ī�� ��ȣ �������� ����
			System.out.println(pattern[p_Rand] + "�� " + number[n_Rand]);
		}
	}
}
