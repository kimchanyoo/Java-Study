package Chapter4;

public class Date {
	int year;
	int month;
	int day;
	String monthly;
	public Date(int y, int m, int d, String t) {
		year = y;
		month = m;
		day = d;
		monthly = t;
	}
	public String print1() {
		return year+"."+month+"."+day;
	}
	public String print2() {
		return monthly+" "+day+", "+year;
	}
}
