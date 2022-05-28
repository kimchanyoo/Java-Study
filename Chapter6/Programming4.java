/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
package Chapter6;

class Rectangle { // �Ϲ����� �簢���� ��Ÿ���� Ŭ����
	int width, height; // ����, ���� ���� ���� ����

	public Rectangle(int width, int height) { // ������ ����
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle { // Rectangle Ŭ������ ��ӹ޴� ���� �ִ� �簢���� ��Ÿ���� Ŭ����
	String color; // ���� ���� ����

	public ColorRectangle(int width, int height, String color) { // ������ ����
		super(width, height); // �θ� Ŭ������ ������ ����
		this.color = color;
	}
}

public class Programming4 {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue"); // obj ��ü ����
		System.out.println("����: " + obj.width);
		System.out.println("����: " + obj.height);
		System.out.println("����: " + obj.color);
	}
}
