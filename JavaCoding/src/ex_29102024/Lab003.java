package ex_29102024;

public class Lab003 {
	public static void main(String args) {
		/* Write code to print Left Triagle star pattern
		 
		 * * * * * * *
		 * * * * * *
		 * * * * *
		 * * * * 
		 * * * 
		 * *
		 * 
		 
		 
		 */
		for(int i = 7; i >=1; i--)
		{
			
			for (int j = 1; j<=i; j++)
			{
				System.out.print("*");
					
			}
			System.out.println();
		}
		}
}
	