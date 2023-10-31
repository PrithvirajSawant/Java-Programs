package Arrays;

public class nextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {17,26,8};
//		System.out.println(isPrime(6)); // to check
		for(int i=0;i<arr.length;i++)
		{
			int num = arr[i];
			if(isPrime(num))
			{
				System.out.print(num+" ");
			}
			else
			{
				for(int j=num;;j++)
				{
					if(isPrime(j))
					{
						System.out.print(j+" ");
						break;
					}
				}
			}
		}
	}
	public static boolean isPrime(int n)
	{
		int num = n;
//		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
//				flag = false;
				return false;
			}
		}
//		if(flag)
			return true;
//		else
//			return false;
	}

}
