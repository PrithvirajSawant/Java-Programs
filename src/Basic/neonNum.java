package Basic;

public class neonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		int temp = num;
		int rem = 0;
		int sum = 0;
		num = num*num;
		while(num>0) {
			rem = num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Neon num");
		}
		else
		{
			System.out.println("Not a Neon num");
		}

	}

}
