import java.util.Scanner;

public class For_Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�: ");
		int number = s.nextInt();
		
		System.out.println(number + "�� ����� ������ �����ϴ�.");
		for(int i =1; i < number; i++) {
			if(number%i ==0)
				System.out.print(" "+ i );
		}
	}

}
