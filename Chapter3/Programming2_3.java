/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
import java.util.Scanner;

public class Programming2_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String oper = s.nextLine(); // 연산자 입력
		System.out.println("피연산자 2개 입력하세요: ");
		int x = s.nextInt();  //피연산자 1
		int y = s.nextInt();  //피연산자 2
		if(oper.equals("+")) {  //문자열의 비교는 .equals를 사용한다.
			System.out.println((float)x + "+" + (float)y + " = " + (float)(x+y));
		}
		else if(oper.equals("-")) {
			System.out.println((float)x + "-" + (float)y + " = " + (float)(x-y));
		}
		else if(oper.equals("*")) {
			System.out.println((float)x + "*" + (float)y + " = " + (float)(x*y));
		}
		else if(oper.equals("/")) {
			if(y != 0) { // 분모 값이 0인지 확인 
				System.out.println((float)x + "/" + (float)y + " = " + (float)(x/y));
			}
			else {
				System.out.println("분모가 0입니다.");
			}
		}
	}

}
