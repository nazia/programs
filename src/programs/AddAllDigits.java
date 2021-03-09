package programs;

public class AddAllDigits {

	public static void main(String[] args) {

		int n = 44235;

		int sum = addDigits(n);

		System.out.println(sum);

	}

	static int addDigits(int n){
		
		int sum=0;
		
		while(n>0){
			int lastDigit=n%10;
			sum=sum+lastDigit;
			n=n/10;//pull tens digit to units place
		}
		
		//check if single digit or not
		if(sum/10>0){
			sum=addDigits(sum);
		}
		
		return sum;
	}
}
