import java.util.Scanner;

public class Typestudy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double number1 = s.nextDouble();
		double number2 = s.nextDouble();
		double number3 = s.nextDouble();
		
		System.out.println(number1+number2+number3);
		
		int v =10;
		int k = v++%5;
		System.out.println("v의 값: " + v);
		System.out.println("k의 값(v++): " + k);
		v=10;
		k = ++v%5;
		System.out.println("k의 값(++v): " + k);
	}

}