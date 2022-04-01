import java.util.Scanner;

public class For_Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int number = s.nextInt();
		
		System.out.println(number + "의 약수는 다음과 같습니다.");
		for(int i =1; i < number; i++) {
			if(number%i ==0)
				System.out.print(" "+ i );
		}
	}

}
