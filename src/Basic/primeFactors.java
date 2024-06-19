package Basic;

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0 && num%i==0)
			{
				System.out.println(i);
			}
			else
				count=0;
			
		}

	}

}
