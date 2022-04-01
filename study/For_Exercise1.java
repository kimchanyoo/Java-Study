import java.util.Scanner;

public class For_Exercise1 {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하시요: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i =1;i<=n;i++) {
			fact = fact * i;
		}
		
		System.out.println(n+"!은 " + fact + "입니다.");
	}

}
