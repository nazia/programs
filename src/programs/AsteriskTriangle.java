package programs;

public class AsteriskTriangle {

	public static void main(String[] args) {
		
		int rows=10;
		
		//for rows
		for(int i=1;i<=rows;i++){
			
			//for spaces
			for(int space=1;space<=rows-i;space++){
				System.out.print(" ");
			}
			
			//for asterisks
			for(int asterisk=1;asterisk<=(i*2)-1;asterisk++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
