package programs;

public class PowerOf4 {

	public static void main(String[] args) {

		int number = 64;
		int n = number;
		boolean isPower = true;

		while (n > 1) {

			if (n % 4 != 0) {

				isPower = false;
				break;
			}
			
			n = n / 4;
		}

		if (isPower) {
			System.out.println(number + " is a power of 4.");
		}
	}

}
