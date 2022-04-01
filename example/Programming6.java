import java.util.Scanner;

public class Programming6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("드라이브 이름: ");
		String drive = s.nextLine();
		System.out.print("디렉터리 이름: ");
		String directory = s.nextLine();
		System.out.print("파일 이름: ");
		String file = s.nextLine();
		System.out.print("확장자: ");
		String type = s.nextLine();
		System.out.println();
		System.out.println("완전한 이름은 "+drive+":"+directory+file+"."+type);

	}

}
