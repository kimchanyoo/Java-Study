package Chapter3;

import java.util.Arrays;

public class RaggedArray1 {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5,6,7};
		arr[2] = new int[] {8,9};
		
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
