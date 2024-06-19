package Recursion;

public class xpown {
	public static int calcPow(int x, int n)
	{
//		int x = 2;
		if(n == 0)
		{
			return 1;
		}
		if(x == 0)
		{
			return 0; 
		}
//		int xPowm1 = calcPow(x,n-1);
//		int xPow = x * xPowm1;
//		return xPow;
		return x * calcPow(x,n-1); //short
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2 , n = 5;
		int ans = calcPow(x,n);
		System.out.println(ans);

	}

}
//here stack height = n