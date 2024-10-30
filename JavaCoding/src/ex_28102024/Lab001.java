package ex_28102024;

public class Lab001 {
	public static void main(String[] args) {
		int a = 20, b = 20;
		
//		if (a>b)
//		{
//			System.out.println(a);
//		}
//		else
//		{
//			System.out.println(b);
//		}
		
		String max =(a>b)? "a": (b>a)? "b":"Both are equal";
		System.out.println(max);
	}
}