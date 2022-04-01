import java.util.Scanner;

public class Exercise8_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1; i <= n;i++) {
			sum = sum +(i*i+1);
		}
		System.out.println(sum);
	}

}
