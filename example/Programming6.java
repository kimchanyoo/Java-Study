import java.util.Scanner;

public class Programming6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����̺� �̸�: ");
		String drive = s.nextLine();
		System.out.print("���͸� �̸�: ");
		String directory = s.nextLine();
		System.out.print("���� �̸�: ");
		String file = s.nextLine();
		System.out.print("Ȯ����: ");
		String type = s.nextLine();
		System.out.println();
		System.out.println("������ �̸��� "+drive+":"+directory+file+"."+type);

	}

}
