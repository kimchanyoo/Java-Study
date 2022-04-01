/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
public class Exercise2_3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {      // i가 0, 1, 2로 증가
			switch(i) {
			case 0: break;  
			case 1: System.out.print("one "); // i가 1의 경우 출력하지만 break가 없기 때문에 밑의 case 2와 case 3도 실행시킴
			case 2: System.out.print("two ");
			case 3: System.out.print("three ");
			}
		}
		System.out.println("done");  //for문 이후 출력

	}
}
