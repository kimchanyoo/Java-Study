import java.util.Scanner;

public class For_Exercise1 {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i =1;i<=n;i++) {
			fact = fact * i;
		}
		
		System.out.println(n+"!�� " + fact + "�Դϴ�.");
	}

}
