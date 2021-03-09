package programs;

public class ReverseStringUsingAppend {

	public static void main(String[] args) {
		String s = "INDIA";
		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {

			sb.append(s.charAt(i));

		}
		
		System.out.println("Reverse of string: " + s + " is : " + sb.toString());
	}

}
