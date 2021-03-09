package programs;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 27;
		boolean isPrime = true;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println(n+" is a Prime Number.");
		}else {
			System.out.println(n+" is NOT a Prime Number.");
		}
	}

}
