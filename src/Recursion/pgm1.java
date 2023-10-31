package Recursion;

public class pgm1 {
	public static void printNum(int n)
	{
		if(n == 0)
		{
			return; // Results in stackOverflow if not written 
		}
		System.out.println(n);
		printNum(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		printNum(n);
	}


}
