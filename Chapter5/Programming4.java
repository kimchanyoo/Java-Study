package Chapter5;
class Car{
	String model;
	String make;
	static int numberOfCars =0;
	public Car(String model, String make) {
		this.model = model;
		this.make = make;
		numberOfCars++;
	}
	public static void getNumberOfCars() {
		System.out.println("�ڵ��� 1�� ����, ���� ���귮="+numberOfCars+"��");
	}
}
public class Programming4 {

	public static void main(String[] args) {
		Car car1 = new Car("�׽��� �� Y","�׽���");
		Car.getNumberOfCars();
		Car car2 = new Car("���812","���");
		Car.getNumberOfCars();
		Car car3 = new Car("�ҳ�Ÿ","����");
		Car.getNumberOfCars();
	}

}
