package Recursion;

public class factorial {
	public static int calcFact(int n)
	{
		if(n == 1 || n == 1)
		{
			return 1;
		}
		int fact_nm1 = calcFact(n-1);
		int fact_n = n * fact_nm1;
		return fact_n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int ans = calcFact(n);
		System.out.println(ans);

	}

}
