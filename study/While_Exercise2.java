import java.util.Scanner;

public class While_Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month;
		do
		{
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = s.nextInt();
		}while(month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month);
	}

}
