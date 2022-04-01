import java.util.ArrayList;

public class ArrayList_exercise {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ã¶¼ö");
		list.add("¼®È¯");
		list.add("¹üÁø");
		list.add("¿µÈñ");
		list.remove(0);
		for(String obj : list) {
			System.out.print(obj + " ");
		}
	}
}
