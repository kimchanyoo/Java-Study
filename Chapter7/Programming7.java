/*
 �а� : ��ǻ�Ͱ��а�
 �й� : 20191439
 �г� : 2�г�
 �̸� : ������
 */
package Chapter7;
import java.util.ArrayList;
import java.util.Iterator;
class CardDeck{  // ���ο� ī�带 ���� Ŭ����
	String card;   //ī�带 ������ ����
	public CardDeck(String card) {  // ������ ����
		this.card = card;
	}
}
public class Programming7 {
	public static void main(String[] args) {
		ArrayList<CardDeck> list = new ArrayList<CardDeck>();  // ArrayList�� �̿��� ��ü�迭 ����
		list.add(new CardDeck("2"));  // �迭�� ���� ����ֱ�
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
		
		Iterator a = list.iterator();  // list�� �迭�� ���������� ���� Iterator ��ü a�� ����
		while(a.hasNext()) {  // a�� ��ȯ�� ��Ұ� �ִٸ� True
			CardDeck deck = (CardDeck)a.next();   // a�� �ݺ� ������Ҹ� ��ȯ�ϴ� ���� deck�̶�� CardDeck��ü�� ��ȯ
			System.out.println("next()�� ��ȯ�ϴ� ��: "+deck.card);  
		}

	}

}
