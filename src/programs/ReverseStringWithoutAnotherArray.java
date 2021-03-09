package programs;

import java.util.Arrays;

public class ReverseStringWithoutAnotherArray {

	public static void main(String[] args) {

		char[] c = { 'G', 'E', 'R', 'M', 'A', 'N', 'Y' };

		for (int m = c.length - 1, n = 0; m >= 0 && n < c.length; m--, n++) {
			
			if (n < m) {
				char temp = c[m];
				c[m] = c[n];
				c[n] = temp;
			}

		}
		System.out.println("Reverse of given string is : " + Arrays.toString(c));

	}

}
