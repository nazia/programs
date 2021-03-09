package programs;

public class AllPrimes {

	public static void main(String[] args) {

		int number = 100;

		for (int n = 2; n <= number; n++) {

			boolean isPrime = true;

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(n + " is a Prime Number.");
			} else {
				System.out.println(n + " is NOT a Prime Number.");
			}
		}

	}

}
