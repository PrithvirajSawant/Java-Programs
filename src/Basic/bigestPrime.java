package Basic;
//last 3 prime numbers
public class bigestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int count2 = 0;
		for(int i=10;i>=1;i--)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			
			if(count == 0 && count2<3)
			{
				System.out.println("Prime num " +i);
				count2++;
			}
			
//			if(count == 0 && count2<=3)
//			{
//				System.out.println("Prime num " +i);
////				break;
//			}
			else
			{
				count = 0;
			}
		}

	}

}
