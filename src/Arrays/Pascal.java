package Arrays;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][];
		pascal(a);
		int sp=4;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=sp;j++)System.out.print(" ");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			sp--;
		}

	}
	public static int[][] pascal(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||i==j) //left //right
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}

}


