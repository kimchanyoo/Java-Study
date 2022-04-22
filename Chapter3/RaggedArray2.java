package Chapter3;

import java.util.Arrays;

public class RaggedArray2 {

	public static void main(String[] args) {
		int [][] arr = new int[4][];
		
		arr[0] = new int[] {12};
		arr[1] = new int[] {32,12,38};
		arr[2] = new int[] {14,6};
		arr[3] = new int[] {3};
		
//		for(int i = 0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		for(int[] row : arr){
			System.out.println(Arrays.toString(row));
		}
	}

}
