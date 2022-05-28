/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
package Chapter6;

class Sports { // 부모 클래스 Sports 선언
	String getName() { // 경기이름이 선언되지 않은 경우
		return "아직 결정되지 않음";
	}

	int getPlayers() { // 경기자수의 초기값을 0으로 반환
		return 0;
	}
}

class Soccer extends Sports { // Sports클래스를 상속받는 자식클래스 Soccer
	@Override
	String getName() { // 오버라이드를 통해 경기이름을 반환
		return "축구";
	}

	@Override
	int getPlayers() { // 오버라이드를 통해 경기자수를 반환
		return 11;
	}
}

public class Programming3 {

	public static void main(String[] args) {
		Soccer soccer = new Soccer(); // soccer객체 생성
		System.out.println("경기이름: " + soccer.getName());
		System.out.println("경기자수: " + soccer.getPlayers());
	}

}
