package ex_29102024;

import java.util.Scanner;

public class Lab001 {
public static void main(String[] args) {
	// Write java code to find number is even or odd
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = sc.nextInt();
	
	if(num%2==0)
	{
		System.out.println(num+ " is Even number");
	}
	else 
	{
	System.out.println(num+ " is Odd number");
	}
}

}
