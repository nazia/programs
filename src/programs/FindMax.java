package programs;

public class FindMax {

	public static void main(String[] args) {

		int[] a = { 4, 6, 10, 5, 66, 321, 8, 3, 2, 99, 55, 33 };

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println("Max value in array is :" + max);
	}

}
