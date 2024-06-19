package Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {1,66,9,7,10,3,12,59};
//		int secondhighestNum = Integer.MIN_VALUE;
//		int heighestNum = Integer.MIN_VALUE;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>heighestNum)
//			{
//				secondhighestNum=heighestNum;
//				heighestNum=a[i];
//			}
//			else if(a[i]>secondhighestNum && a[i]<heighestNum)
//			{
//				secondhighestNum=a[i];
//			}
//		}
//		System.out.println(secondhighestNum);
		
		//2-D Array
		int[][] a = {{1,3,5},{45,21,22},{12,23,34}};
		int secondhighestNum = Integer.MIN_VALUE;
		int heighestNum = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>heighestNum)
				{
					secondhighestNum = heighestNum;
					heighestNum = a[i][j];
				}
				else if(a[i][j]>secondhighestNum && a[i][j]<heighestNum)
				{
					secondhighestNum = a[i][j];
				}
			}
		}
		System.out.println(secondhighestNum);

	}

}
