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
		
		list.add(new Word("apple","사과"));
		list.add(new Word("house","집"));
		list.add(new Word("mouse","쥐"));
		list.add(new Word("computer","컴퓨터"));
		list.add(new Word("banan","바나나"));
		list.add(new Word("water","물"));
		list.add(new Word("pencil","연필"));
	
		while(true) {
			int count = 0;
			System.out.print("검색할 영어 단어를 입력하시오(종료는 quit): ");
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
				System.out.println("사전에 없는 단어입니다.");
			}
		}
		System.out.println("사전을 종료합니다.");
	}
}
