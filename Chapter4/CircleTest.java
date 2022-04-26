package Chapter4;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj; //변수 선언부
		obj = new Circle(); //변수 배정부 축약형 /단축문
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.getArea();
		System.out.println("원의 면적= "+area);
		Circle obj1;
		obj1 = new Circle();
		obj1.color = "red";
		obj1.radius = 100;
	}

}
