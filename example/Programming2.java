import java.util.Scanner;

public class Programming2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = s.nextDouble();
		
		System.out.println(mile + "마일은 " + (mile*1.609) + "킬로미터입니다.");
	}

}
