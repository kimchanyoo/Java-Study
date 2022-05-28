/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
package Chapter6;

class Rectangle { // 일반적인 사각형을 나타내는 클래스
	int width, height; // 가로, 세로 길이 변수 선언

	public Rectangle(int width, int height) { // 생성자 선언
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle { // Rectangle 클래스를 상속받는 색이 있는 사각형을 나타내는 클래스
	String color; // 색상 변수 선언

	public ColorRectangle(int width, int height, String color) { // 생성자 선언
		super(width, height); // 부모 클래스의 생성자 선언
		this.color = color;
	}
}

public class Programming4 {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue"); // obj 객체 생성
		System.out.println("가로: " + obj.width);
		System.out.println("세로: " + obj.height);
		System.out.println("색상: " + obj.color);
	}
}
