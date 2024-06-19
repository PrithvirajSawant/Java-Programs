package Basic;

public class automorphicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int temp = num;
		int sq = num*num;
		int count = 0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		
//		System.out.println(count);
		int end = sq%(int)Math.pow(10, count); //rem
		
		if(temp==end)
		{
			System.out.println("Automorphic num");
		}
		else
			System.out.println("Not Automorphic num");
		
		//range
//		for(int i = 1;i<50;i++)
//		{
//			int num = i;
//			int temp = num;
//			int sq = num*num;
//			int count = 0;
//			while(num>0)
//			{
//				count++;
//				num/=10;
//			}
//			int end = sq%(int)Math.pow(10,count);
//			if(temp==end)
//			{
//				System.out.println(temp);
//			}
//		}
//		
		

	}

}
