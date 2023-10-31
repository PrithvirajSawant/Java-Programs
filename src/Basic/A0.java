package Basic;

public class A0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int count = 0;
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		num = temp;
		while(num>0) {
			rem = num%10;
			int fact = 1;
			for(int i=1;i<=count;i++) {
				fact*=rem;
//				System.out.println(fact);
			}
			sum+=fact;
			num/=10;
		}
		System.out.println(sum);
		if(temp == sum)
		{
			System.out.println("Armstrong no.");
		}
		else
		{
			System.out.println("Not an Armstrong no.");
		}
		

	}

}
