import java.util.Scanner;

public class Number_guess {

	public static void main(String[] args) {
		int number = (int)(Math.random()*100), guess, count = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = s.nextInt();
			if(guess < number) {
				System.out.println("제시한 정수가 낮습니다.");
			}
			else if(guess > number) {
				System.out.println("제시한 정수가 높다고 출력한다.");
			}
			count = count +1;
		}while(guess != number);
		
		System.out.println("축하합니다. 시도횟수: " + count);
	}

}