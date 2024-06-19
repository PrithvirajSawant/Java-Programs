package Basic;

public class UntilSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3894;
		int rem = 0;
		do
		{
			int sum = 0;
			while(num>0)
			{
				rem = num%10;
				sum+=rem;
				num/=10;
			}
			num=sum;
		}while(num>9);
		System.out.println(num);
	}

}
