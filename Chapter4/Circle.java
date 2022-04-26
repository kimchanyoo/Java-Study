package Chapter4;

public class Circle {
	public int radius;
	public String color;
	
	public Circle(int radius) {
		this.radius =radius;
	}
	
	public Circle() {
		this(0); //Circle(0);을 의미한다
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}
}
