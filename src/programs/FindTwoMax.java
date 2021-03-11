package programs;

public class FindTwoMax {

	public static void main(String[] args) {

		int[] a = { 4, 6, 10, 5, 66, 321, 8, 3, 2, 99, 55, 33 };
		int max = Integer.MIN_VALUE;
		int secMax = max;
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				secMax = max;
				max = a[i];

			} else if (secMax < a[i]) {
				secMax = a[i];
			}
		}

		System.out.println("max=" + max + "  and secMax=" + secMax);

	}

}
