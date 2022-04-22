package Chapter3;

import java.util.Arrays;

public class Programming3_3 {

	public static void main(String[] args) {
		String[] arr = new String[50];
		for (int i = 1; i < 51; i++) {
			if (i > 10) {
				if (i / 10 == 3 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					arr[i - 1] = "¦";
				} else {
					arr[i - 1] = Integer.toString(i);
				}
			} else {
				if (i % 3 == 0) {
					arr[i - 1] = "¦";
				} else {
					arr[i - 1] = Integer.toString(i);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
