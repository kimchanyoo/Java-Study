import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� 1: ");
		int number1 = s.nextInt();
		System.out.print("���� 2: ");
		int number2 = s.nextInt();
		
		System.out.println("����= " + (number1+number2));
		System.out.println("����= " + (number1-number2));
		System.out.println("����= " + (number1*number2));
		System.out.println("������= " + ((double)number1/(double)number2));	
		}
}