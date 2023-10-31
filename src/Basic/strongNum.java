package Basic;

public class strongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145;
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			rem = num%10;
			int fact  = 1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Strong no.");
		}
		else
		{
			System.out.println("Not a strong no.");
		}

	}

}
