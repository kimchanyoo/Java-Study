/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
package Chapter7;
import java.util.ArrayList;
import java.util.Iterator;
class CardDeck{  // 내부에 카드를 정할 클래스
	String card;   //카드를 저장할 변수
	public CardDeck(String card) {  // 생성자 선언
		this.card = card;
	}
}
public class Programming7 {
	public static void main(String[] args) {
		ArrayList<CardDeck> list = new ArrayList<CardDeck>();  // ArrayList를 이용한 객체배열 생성
		list.add(new CardDeck("2"));  // 배열에 값을 집어넣기
		list.add(new CardDeck("3"));
		list.add(new CardDeck("4"));
		list.add(new CardDeck("5"));
		list.add(new CardDeck("6"));
		list.add(new CardDeck("7"));
		list.add(new CardDeck("8"));
		list.add(new CardDeck("9"));
		list.add(new CardDeck("10"));
		list.add(new CardDeck("J"));
		list.add(new CardDeck("Q"));
		list.add(new CardDeck("K"));
		list.add(new CardDeck("ACE"));
		
		Iterator a = list.iterator();  // list의 배열에 순차접근을 위해 Iterator 객체 a를 생성
		while(a.hasNext()) {  // a에 반환할 요소가 있다면 True
			CardDeck deck = (CardDeck)a.next();   // a의 반복 다음요소를 반환하는 값을 deck이라는 CardDeck객체에 반환
			System.out.println("next()가 반환하는 값: "+deck.card);  
		}

	}

}
