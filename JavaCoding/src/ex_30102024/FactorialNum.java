package ex_30102024;

public class FactorialNum {
	public static void main(String[] args) {
		//write a program to find fact of 5
        //5!= 5*4*3*2*1 = 120
		
		int num = 5;
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
