package programs;

import java.util.Arrays;

public class ReverseStringUsingArray {

	public static void main(String[] args) {

		String s = "LONDON";
		
		char[] c = s.toCharArray();//source array
		char[] d = new char[c.length];//destination array

		//traversing 2 arrays in opposite directions
		for (int i = c.length - 1, k = 0; i >= 0 && k < d.length; i--, k++) {

			//creating reverse array
			d[k]=c[i];
			
		}

		System.out.println("Reverse of string: " + s + " is : " + Arrays.toString(d));

		
	}

}
