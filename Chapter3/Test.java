package Chapter3;

public class Test {
	public static void main(String arg[]) {
		var day = "SAT";
		var today = "";
		switch (day) {
		case "SAT", "SUN" -> today = "주말";
		case "MON", "TUS", "WED", "THU", "FRI" -> today = "평일";
		default -> System.out.println("ERROR");
		}
		System.out.println(today);
	}
}
