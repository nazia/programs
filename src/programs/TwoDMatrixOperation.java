package programs;

public class TwoDMatrixOperation {

	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };

		int c[][] = new int[a.length][a[0].length];

		for (int i = 0, m = 0, x = 0; i < a.length && m < b.length && x < c.length; i++, m++, x++) {
			for (int j = 0, n = 0, y = 0; j < a[i].length && n < b[m].length && y < c[x].length; j++, n++, y++) {
				c[x][y] = a[i][j] * b[m][n];
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + ",");
			}
			System.out.println();
		}
	}

}
