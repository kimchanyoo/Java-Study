import java.util.Scanner;

public class Nested_loop1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�������� ���� �Է��Ͻÿ�: ");
		int row = s.nextInt();
		System.out.print("�������� ���� �Է��Ͻÿ�: ");
		int col = s.nextInt();
		
		for(int i =0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
