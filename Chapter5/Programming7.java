package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

class Word{
	String eng;
	String kor;
	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
}
public class Programming7 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		
		list.add(new Word("apple","���"));
		list.add(new Word("house","��"));
		list.add(new Word("mouse","��"));
		list.add(new Word("computer","��ǻ��"));
		list.add(new Word("banan","�ٳ���"));
		list.add(new Word("water","��"));
		list.add(new Word("pencil","����"));
	
		while(true) {
			int count = 0;
			System.out.print("�˻��� ���� �ܾ �Է��Ͻÿ�(����� quit): ");
			String word = s.next();
			if(word.equals("quit")) {
				break;
			}
			for(Word name : list) {
				if(name.eng.equals(word)) {
					System.out.println(word+" -> "+name.kor);
					break;
				}
				count++;
			}
			if(count == list.size()) {
				System.out.println("������ ���� �ܾ��Դϴ�.");
			}
		}
		System.out.println("������ �����մϴ�.");
	}
}
