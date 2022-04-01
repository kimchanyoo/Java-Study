import java.util.Scanner;

public class Programming5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("시간간격을 입력하시오(단위: 초): ");
		int time = s.nextInt();
		
		System.out.println("번개가 발생한 곳까지의 거리: "+ (time * 340) + "m");

	}

}
