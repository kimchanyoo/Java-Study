package Chapter3;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0, num;
		int goal = (int)(Math.random()*100);
		do {
			count++;
			System.out.print("정답을 추측하여 보시오: ");
			num = s.nextInt();
			if(num>goal) {
				System.out.println("제시한 정수가 높습니다.");
			}
			else if(num<goal) {
				System.out.println("제시한 정수가 낮습니다.");
			}
		}while(num !=goal);
		System.out.println("축하합니다. 시도횟수="+count);
	}

}
