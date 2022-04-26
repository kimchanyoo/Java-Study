package Chapter4;

public class Rocket {
	int x;
	int y;
	
	public Rocket(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x: "+ this.x + " y: " + this.y;
	}
	public int moveUp() {
		this.y = this.y +1;
		return this.y;
	}
}