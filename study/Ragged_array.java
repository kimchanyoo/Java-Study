
public class Ragged_array {

	public static void main(String[] args) {
		int[][] ragged = new int[3][];
		
		ragged[0] = new int[1];
		ragged[1] = new int[2];
		ragged[2] = new int[3];
		
		for(int i =0;i < ragged.length;i++) {
			for(int j =0; j < ragged[i].length;j++) {
				ragged[i][j] = j;
				System.out.println(ragged[i][j]);
			}
		}
	}

}
