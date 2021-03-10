package programs;

public class NumberPalindrome {

	public static void main(String[] args) {

		int n = 1441;

		int number = n;
		int reverseNumber = 0;

		while (number > 0) {

			// fetch last digit
			int lastDigit = number % 10;

			// re-construct the number in reverse order
			reverseNumber = reverseNumber * 10 + lastDigit;

			// move tens digit to units place
			number = number / 10;
		}

		if (reverseNumber == n) {
			System.out.println(n + " is a Palindrome");
		} else {
			System.out.println(n + " is NOT a Palindrome");
		}
	}

}
