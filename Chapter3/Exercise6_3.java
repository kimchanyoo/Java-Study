/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
public class Exercise6_3 {
	public static void main(String[] args) {
		int age = 16;
		int x = 0;
		if(0 < age && age < 18)  //논리연산자에 따라 && 사용
			System.out.println("청소년");
		if(x == 0)  // 관계연산자에 따라 =이 아닌 == 사용
			System.out.println("x는 0이다.");
	}
}
