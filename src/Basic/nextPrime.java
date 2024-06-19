package Basic;
//it will print the next prime number of that number
public class nextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int count = 0;
		int count2 = 0;
		for(int i=num;i<10;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==0)
			{
				count2++;
			}
			if(count==0 && count2>1)
			{
				System.out.println(i);
				break;
			}
			else
			{
				count=0;
			}
		}

	}

}
