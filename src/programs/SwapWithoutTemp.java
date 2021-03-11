package programs;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int x=10;
		int y=3;
		
		System.out.println("x="+x+" and y="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x="+x+" and y="+y);

	}

}
