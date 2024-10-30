package ex_28102024;

public class Lab002 {
	public static void main(String[] args) {
		//write Java program to find maximum of three numbers
		int a1 = 102, b = 100, c = 101;
			
//		 if (a >= b && a >= c)
//			 
//	         System.out.println( a + " is the maximum number.");
//		 
//	      else if (b >= a && b >= c)
//	    	  
//	         System.out.println( b + " is the maximum number.");
//		 
//	      else
//	    	  
//	         System.out.println( c + " is the maximum number.");
		
		// By using Ternary operators
		String max = (a1>b && a1>c)? "a" : (b>a1 && b>c) ? "b" : (c>a1 && c>b) ? "c" :"Two numbers are equal";
		System.out.println(max);
	   }
}