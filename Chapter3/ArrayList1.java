package Chapter3;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("범진");
		list.add("성건");
		list.add("석환");
		list.add("해용");
		for(String obj : list) {
			System.out.println(obj);
		}
	}

}
