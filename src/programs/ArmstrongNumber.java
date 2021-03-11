package programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 371;

		int n = number;
		int countOfDigits = String.valueOf(number).length();
		int sum = 0;
		while (n > 0) {

			int lastDigit = n % 10;

			sum = sum + (int) Math.pow(lastDigit, countOfDigits);

			n = n / 10;
		}

		if (sum == number) {
			System.out.println("Its an Armstrong number.");
		} else {
			System.out.println("Its NOT an Armstrong number.");

		}
	}

}
