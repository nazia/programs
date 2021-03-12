package programs;

public class BinaryCheck {

	public static void main(String[] args) {

		int number = 101000110;

		int n = number;
		boolean isBinary = true;
		while (n > 0) {
			int lastDigit = n % 10;

			if (lastDigit != 1 && lastDigit != 0) {
				isBinary = false;
				break;
			}
			n = n / 10;
		}

		if (isBinary) {
			System.out.println(number + " is Binary.");
		} else {
			System.out.println(number + " is Not Binary.");
		}
	}

}
