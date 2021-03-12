package programs;

public class ConvertStringToNumber {

	public static void main(String[] args) {
		String s="45234";
		
		char[] c=s.toCharArray();

		int zero='0';
		int constructNumber=0;
		for(char i:c){
			int ch=i;
			int actualNumber=ch-zero;
			constructNumber=constructNumber*10+actualNumber;
		}
		
		System.out.println(constructNumber);
	}

}
