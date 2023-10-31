package Recursion;

public class Fibonacci {
	public static void fibSeries(int a, int b, int n)
	{
		if(n == 0)
		{
			return;
		}
		int c = a+b;
		System.out.println(c);
		fibSeries(b,c,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		fibSeries(a,b,n-2);

	}

}
