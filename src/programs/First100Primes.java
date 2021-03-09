package programs;

public class First100Primes {

	public static void main(String[] args) {

		
		int count = 0;

		for (int n = 2; count <= 100; n++) {
			
			boolean isPrime = true;
			
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.println(count+") "+n + " is a Prime Number.");
			}

		}
	}

}
