package Chapter3;

public class Programming15_3 {

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		for(int i= 0;i<3;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = (int)(Math.random()*2);
			}
		}
		for(int i= 0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
