package Chapter3;

public class Test {
	public static void main(String arg[]) {
		var day = "SAT";
		var today = "";
		switch (day) {
		case "SAT", "SUN" -> today = "�ָ�";
		case "MON", "TUS", "WED", "THU", "FRI" -> today = "����";
		default -> System.out.println("ERROR");
		}
		System.out.println(today);
	}
}
