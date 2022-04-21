import java.util.Scanner;

public class RockPapaerSissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int num = s.nextInt();

		int computer = (int) (java.lang.Math.random() * 3);
		if (num == computer) {
			System.out.println("인간: " + num + " 컴퓨터: " + computer + " 인간과 컴퓨터가 비김");
		} else if (computer - num < 0) {
			System.out.println("인간: " + num + " 컴퓨터: " + computer + " 인간이 컴퓨터를 이김");
		} else {
			System.out.println("인간: " + num + " 컴퓨터: " + computer + " 컴퓨터가 인간을 이김");
		}

	}
}