package Chapter5;

class ECar {
	int distance = 0;
	int battery = 100;
	static ECar instance = new ECar();

	public void dispDistance() {
		System.out.println("����Ÿ�: " + distance + "km");
	}

	public void dispBattery() {
		System.out.println("���͸�: " + battery + "%");
	}

	public void drive() {
		distance = distance + 1;
		battery = battery - 10;
	}

	public static ECar getInstance() {
		return instance;
	}
}

public class MiniProject1 {

	public static void main(String[] args) {
		ECar car = ECar.getInstance();
		car.drive();
		car.drive();

		car.dispDistance();
		car.dispBattery();

	}
	
}