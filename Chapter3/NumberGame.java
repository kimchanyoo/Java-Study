package Chapter3;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0, num;
		int goal = (int)(Math.random()*100);
		do {
			count++;
			System.out.print("������ �����Ͽ� ���ÿ�: ");
			num = s.nextInt();
			if(num>goal) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else if(num<goal) {
				System.out.println("������ ������ �����ϴ�.");
			}
		}while(num !=goal);
		System.out.println("�����մϴ�. �õ�Ƚ��="+count);
	}

}
