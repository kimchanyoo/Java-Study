package Chapter3;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("��ȯ");
		list.add("�ؿ�");
		for(String obj : list) {
			System.out.println(obj);
		}
	}

}
