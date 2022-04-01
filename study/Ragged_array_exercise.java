import java.util.Arrays;

public class Ragged_array_exercise {

	public static void main(String[] args) {
		int[][] rarray = new int[3][];
		
		rarray[0] = new int[] {1,2,3};
		rarray[1] = new int[] {4,5,6,7};
		rarray[2] = new int[] {8,9};
		
		for(int[] row: rarray) {
			System.out.println(Arrays.toString(row));
		}
	}

}
