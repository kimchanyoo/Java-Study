/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
package Chapter6;

class Sports { // �θ� Ŭ���� Sports ����
	String getName() { // ����̸��� ������� ���� ���
		return "���� �������� ����";
	}

	int getPlayers() { // ����ڼ��� �ʱⰪ�� 0���� ��ȯ
		return 0;
	}
}

class Soccer extends Sports { // SportsŬ������ ��ӹ޴� �ڽ�Ŭ���� Soccer
	@Override
	String getName() { // �������̵带 ���� ����̸��� ��ȯ
		return "�౸";
	}

	@Override
	int getPlayers() { // �������̵带 ���� ����ڼ��� ��ȯ
		return 11;
	}
}

public class Programming3 {

	public static void main(String[] args) {
		Soccer soccer = new Soccer(); // soccer��ü ����
		System.out.println("����̸�: " + soccer.getName());
		System.out.println("����ڼ�: " + soccer.getPlayers());
	}

}
