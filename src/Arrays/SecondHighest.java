package Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,9,7,10,3,12};
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
//		int max1 = Integer.MAX_VALUE;
//		int max2 = Integer.MAX_VALUE;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max1)
//			{
//				max2=max1;
//				max1=a[i];
//			}
//			else if(a[i]>max2 && a[i]!=max1)
//			{
//				max2=a[i];
//			}
//		}
//		System.out.println(max2);

	}

}
