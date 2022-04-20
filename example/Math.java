import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¼ıÀÚ 1: ");
		int number1 = s.nextInt();
		System.out.print("¼ıÀÚ 2: ");
		int number2 = s.nextInt();
		
		System.out.println("µ¡¼À= " + (number1+number2));
		System.out.println("»¬¼À= " + (number1-number2));
		System.out.println("°ö¼À= " + (number1*number2));
		System.out.println("³ª´°¼À= " + ((double)number1/(double)number2));	
		}
}