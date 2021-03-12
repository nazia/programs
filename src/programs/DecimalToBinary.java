package programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		int number = 6;
		int n = number;

		StringBuilder sb = new StringBuilder();

		while (n > 0) {

			int remainder = n % 2;
			sb.append(remainder);
			n = n / 2;
		}

		System.out.println("Binary representation of " + number + " is:" + sb.reverse().toString());
	}

}
