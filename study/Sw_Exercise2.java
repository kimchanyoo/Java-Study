
public class Sw_Exercise2 {

	public static void main(String[] args) {
		var day = "SAT";
		var today = "";
		switch(day) {
		case "SAT", "SUN" -> today = "�ָ�";
		case "MON", "TUS", "WED", "THU", "FRI" -> today ="����";
		default -> System.out.println("Error");
		}
		System.out.println(today);
	}

}
