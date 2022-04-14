public class MyMath {
	
	int add(int x, int y)  {return x+y;}
	double add(double x, int y) {return x+y;}
	double add(int x, double y) {return x+y;}
	public static void main(String[] args) {
		MyMath obj;
		obj = new MyMath();
		System.out.print(obj.add(10, 53.0)+" ");
	}

}
