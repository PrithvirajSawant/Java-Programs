package Basic;

import java.util.Scanner;

public class RangeA0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start = sc.nextInt();
		System.out.println("Enter the ending range");
		int end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			Armstrong(i);
		}
	}
	public static void Armstrong(int start)
	{
		int num = start;
		int count = 0;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		num=start;
		while(num>0) {
			rem = num%10;
			int fact = 1;
			for(int i=1;i<=count;i++) {
				fact*=rem;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==start)
		{
			System.out.println(sum);
		}
	}

}
