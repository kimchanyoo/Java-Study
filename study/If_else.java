import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2): ");
		int user = s.nextInt();
		
		int computer =(int)(Math.random()*3);
		if(user == computer)
			System.out.println("�ΰ��� ��ǻ�Ͱ� �����");
		else if(user == (computer+1)%3)
			System.out.println("�ΰ�: "+user+" ��ǻ��: "+computer+"       �ΰ� �¸�");
		else
			System.out.println("�ΰ�: "+user+" ��ǻ��: "+computer+"       ��ǻ�� �¸�");
	}

}
