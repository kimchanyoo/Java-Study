import java.util.Scanner;

public class Programming1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		int number = s.nextInt();
		
		System.out.println((number/10) + "박스가 필요하고 " + (number%10) + "개가 남습니다.");
	}

}
