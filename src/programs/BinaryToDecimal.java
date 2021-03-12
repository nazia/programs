package programs;

public class BinaryToDecimal {

	public static void main(String[] args) {

		int number = 111;
		int n = number;
		int sum = 0;
		int counter = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			sum = sum + (int) (lastDigit * Math.pow(2, counter));
			counter++;
			n = n / 10;
		}
		System.out.println("Decimal representation of " + number + " is : " + sum);
	}

}
