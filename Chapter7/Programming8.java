/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
package Chapter7;

interface GetInfo { // �������̽� ����
	double getValue(); // ��ü�� � ���� ��ȯ�ϴ� �޼ҵ�

	public static double average(GetInfo[] objects) { // �� ��ü�� getValue()�� ȣ���� ��հ��� ����ϴ� �޼ҵ�
		if (objects.length == 0) { // �迭�� ���̰� 0�̸�
			return 0;
		}
		double sum = 0;
		for (GetInfo s : objects) { // ��ü �迭�� ���� �ϳ��� ���
			sum = sum + s.getValue();
		}
		return sum / objects.length;
	}
}

class Student implements GetInfo { // �������̽��� ����ϴ� �л� Ŭ����
	double grade;// ������ ��Ÿ���� ���� ����

	@Override
	public double getValue() { // �������̽����� ������ �޼ҵ带 �������̵�
		return this.grade;
	}

	public Student(double grade) { // ������ ����
		this.grade = grade;
	}

}

public class Programming8 {

	public static void main(String[] args) {
		GetInfo[] list = new GetInfo[4]; // ��ü �迭�� �迭�� ũ�⸦ 4�� ����
		list[0] = new Student(4.3); // �迭�� �л��� ���� ���� �Ҵ�
		list[1] = new Student(3.8);
		list[2] = new Student(3.2);
		list[3] = new Student(2.7);

		double aver = GetInfo.average(list); // aver�� �л����� ���� ����� �Ҵ�

		System.out.println("�л����� ������ ���: " + aver);

	}
}
