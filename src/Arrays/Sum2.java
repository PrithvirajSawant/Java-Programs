package Arrays;

public class Sum2 {
//Add until sum is <10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,29,99,89,81};
//		int rem;
		
		for(int i=0;i<arr.length;i++)
		{
			int num = arr[i];
			do
			{
				int sum = 0;
				while(num>0)
				{
					int rem=num%10;
					sum+=rem;
					
					num/=10;
//					if(sum>=18)
//					{
//						sum%=2;
//						break;
//					}
				}
				num=sum;
			}while(num>9);

			System.out.println(num+"="+arr[i]);
//			sum=0;
		}

	}

}
