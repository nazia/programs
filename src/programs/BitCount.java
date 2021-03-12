package programs;

public class BitCount {

	public static void main(String[] args) {

		int counter = 0;
		int number = 111001;
		int n = number;
		while (n > 0) {
			int lastDigit = n % 10;
			if (lastDigit == 1) {
				counter++;
			}
			n = n / 10;
		}
		System.out.println("Bit count of " + number + " is ::" + counter);
	}

}
