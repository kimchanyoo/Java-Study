import java.util.Scanner;

public class Nested_loop2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score, sum =0, count = 0;
		while(true) {
			System.out.print("정수를 입력하시오: ");
			score = s.nextInt();
			if(score < 0) {
				break;
			}
			else {
				sum = sum + score;
				count = count +1;
			}
		}
		System.out.println("평균은 " + sum /count);
	}

}
