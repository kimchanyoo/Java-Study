import java.util.Scanner;

public class Number_guess {

	public static void main(String[] args) {
		int number = (int)(Math.random()*100), guess, count = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			guess = s.nextInt();
			if(guess < number) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else if(guess > number) {
				System.out.println("������ ������ ���ٰ� ����Ѵ�.");
			}
			count = count +1;
		}while(guess != number);
		
		System.out.println("�����մϴ�. �õ�Ƚ��: " + count);
	}

}