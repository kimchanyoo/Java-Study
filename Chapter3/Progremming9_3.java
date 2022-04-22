/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
import java.util.Scanner;

public class Progremming9_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 항의 개수: ");
		int number = s.nextInt();
		int a = 0, b =1, c = 0;
		if(number == 1) {      // 출력할 항의 개수가 1개 일때 
			System.out.println(a);
		}
		else if(number ==2) {    //출력할 항의 개수가 2개 일때
			System.out.println(a + " " + b);
		}
		else if(number >2) {
			System.out.print(a + " " + b);    // 0 과 1은 무조건 고정이므로 미리 출력한다
			for(int i = 0;i < number-2; i++) {  // 0과 1을 앞에서 출력했기 때문에 number-3까지 반복시킨다
				c = a + b;  //c는 앞 2개의 원소의 합니다
				System.out.print(" " + c);
				a = b;  //다음 순번을 위해 a에 b값을 넣는다
				b = c;  // 다음 순번을 위해 b에 c값을 넣는다
			}
		}
		else {
			System.out.println("항의 개수가 잘못되었습니다.");
		}
		
	}

}
