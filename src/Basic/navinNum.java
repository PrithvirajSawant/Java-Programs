package Basic;

public class navinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			 rem = num%10;
			 sum+=rem;
			 num/=10;
		}
		num=temp;
		if(num%sum==0)
		{
			System.out.println("Navin num");
		}
		else
		{
			System.out.println("Not a Navin num");
		}

	}

}
