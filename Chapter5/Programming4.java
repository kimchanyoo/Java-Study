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
		System.out.println("자동차 1대 생산, 누적 생산량="+numberOfCars+"대");
	}
}
public class Programming4 {

	public static void main(String[] args) {
		Car car1 = new Car("테슬라 모델 Y","테슬라");
		Car.getNumberOfCars();
		Car car2 = new Car("페라리812","페라리");
		Car.getNumberOfCars();
		Car car3 = new Car("소나타","현대");
		Car.getNumberOfCars();
	}

}
