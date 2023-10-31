package Basic;

public class primeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1;i<=10;i++)
		{
			for(int j=2;j<i;j++)   // i-1 => if 1 = 4 iterations will be only till 3 i.e,j<=i-1 as we know that 4%4 == 0
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			else
			{
				count = 0;
			}
		}

	}

}
