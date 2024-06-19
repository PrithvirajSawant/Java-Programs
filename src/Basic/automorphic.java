package Basic;

public class automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 76;
		int temp = num;
		int sq = num*num;
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		
		int d=1;
		while(count!=0)
		{
//			if(count>1) //  if int d = 10;
				d = d*10;
			count--;
		}
		
//		int rem = 0;
//		rem=sq%d;
		if(num==sq%d)
		{
			System.out.println("Automorphic");
		}	
		else
			System.out.println("Not Automorphic");

	}

}
