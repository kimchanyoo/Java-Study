import java.util.Scanner;

public class Sw_Exercise {

	public static void main(String[] args) {
		int score, number;
		char grade;
		
		Scanner s = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score = s.nextInt();
		number = score/10;
		switch(number) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점: "+grade);

	}

}


	