import java.util.Scanner;

public class Nested_loop1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("가로줄의 수를 입력하시오: ");
		int row = s.nextInt();
		System.out.print("세로줄의 수를 입력하시오: ");
		int col = s.nextInt();
		
		for(int i =0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
