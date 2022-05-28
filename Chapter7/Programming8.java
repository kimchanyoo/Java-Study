/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
package Chapter7;

interface GetInfo { // 인터페이스 선언
	double getValue(); // 객체의 어떤 값을 반환하는 메소드

	public static double average(GetInfo[] objects) { // 각 객체의 getValue()를 호출해 평균값을 계산하는 메소드
		if (objects.length == 0) { // 배열의 길이가 0이면
			return 0;
		}
		double sum = 0;
		for (GetInfo s : objects) { // 객체 배열의 값을 하나씩 사용
			sum = sum + s.getValue();
		}
		return sum / objects.length;
	}
}

class Student implements GetInfo { // 인터페이스를 사용하는 학생 클래스
	double grade;// 학점을 나타내는 변수 선언

	@Override
	public double getValue() { // 인터페이스에서 쓰여진 메소드를 오버라이드
		return this.grade;
	}

	public Student(double grade) { // 생성자 선언
		this.grade = grade;
	}

}

public class Programming8 {

	public static void main(String[] args) {
		GetInfo[] list = new GetInfo[4]; // 객체 배열을 배열의 크기를 4로 선언
		list[0] = new Student(4.3); // 배열에 학생의 학점 값을 할당
		list[1] = new Student(3.8);
		list[2] = new Student(3.2);
		list[3] = new Student(2.7);

		double aver = GetInfo.average(list); // aver에 학생들의 학점 평균을 할당

		System.out.println("학생들의 학점의 평균: " + aver);

	}
}
