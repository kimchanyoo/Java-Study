package Chapter4;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj; //���� �����
		obj = new Circle(); //���� ������ ����� /���๮
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.getArea();
		System.out.println("���� ����= "+area);
		Circle obj1;
		obj1 = new Circle();
		obj1.color = "red";
		obj1.radius = 100;
	}

}
