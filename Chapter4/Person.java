package Chapter4;

public class Person {
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	public void setName(String n) {
		name = n;
	}
	public void setMobile(String m) {
		mobile = m;
	}
	public void setOffice(String o) {
		office = o;
	}
	public void setEmail(String e) {
		email = e;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return name;
	}
	public String getOffice() {
		return name;
	}
	public String getEmail() {
		return name;
	}
	public Person(String n, String m, String o, String e) {
		this.email = e;
		this.mobile = m;
		this.name = n;
		this.office = o;
	}
	public String toString() {
		return "name: "+this.name+" mobile: "+ this.mobile + " office: "+ this.office + " email: "+ this.email;
	}
}
