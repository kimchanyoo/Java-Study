import java.util.ArrayList;

public class ArrayList_exercise {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ö��");
		list.add("��ȯ");
		list.add("����");
		list.add("����");
		list.remove(0);
		for(String obj : list) {
			System.out.print(obj + " ");
		}
	}
}
