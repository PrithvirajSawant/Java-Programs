package Basic;

public class perfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int temp = num;
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Perfect no.");
		}
		else
		{
			System.out.println("Not a Perfect no.");
		}
	}

}
//A positive integer that is equal to the sum of its proper positive divisors excluding the number itself.
//For example, the divisors of 6 are 1, 2 and 3. The sum of the proper divisors of 6 is 1 + 2 + 3 = 6, which is a perfect number.