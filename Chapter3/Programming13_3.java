/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
public class Programming13_3 {

	public static void main(String[] args) {
		String[] pattern = {"Clubs", "Diamonds", "Hearts", "Spades"};  //card문양 배열 정의
		String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};  //카드 번호 배열 정의
		for(int i = 0;i < 5;i++) {  //5회 반복
			int p_Rand = (int)(Math.random()*4); // 문양 랜덤숫자 추출
			int n_Rand = (int)(Math.random()*13);  //카드 번호 랜덤숫자 추출
			System.out.println(pattern[p_Rand] + "의 " + number[n_Rand]);
		}
	}
}
