package Basic;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int temp = num;
		int rev = 0;
		int rem = 0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
//		System.out.println(rev);
		if(rev == temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
