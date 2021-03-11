package programs;

public class StringPalindrome {

	public static void main(String[] args) {

		String s = "MALAYALAM";
		boolean isPalindrome = true;
		for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {

			if (s.charAt(i) != s.charAt(j)) {
				isPalindrome = false;
				break;
			}

		}
		if (isPalindrome) {
			System.out.println(s + " is a Palindrome.");
		} else {
			System.out.println(s + " is NOT a Palindrome.");

		}

	}

}
