package Chapter3;

public class Random_Number {

	public static void main(String[] args) {
		double farry [] = new double[10];
		double sum = 0;
		for(int i = 0;i<10;i++) {
			farry[i] = Math.random();
			sum = sum +farry[i];
		}
		for(double s : farry) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("10개의 부동소수점의 합은 "+sum);
	}

}
