import java.util.Scanner;

public class Programming9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Á¤¼ö: ");
		int number = s.nextInt();
		
		char[] result =new char[7];
		result[0] ='0';
		result[1] ='0';
		result[2] ='0';
		result[3] ='0';
		result[4] ='0';
		result[5] ='0';
		result[6] ='0';
		int temp = number;

		if(number>=1) {
			if(number % 2==1) {
				result[6]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[5]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[4]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[3]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[2]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[1]='1';
			}
			number = number/2;
		}
		if(number>=1) {
			if(number % 2==1) {
				result[0]='1';
			}
			number = number/2;
		}
		System.out.println(temp +" : "+result[6]+result[5]+result[4]+result[3]+result[2]+result[1]+result[0]);
	}

}
