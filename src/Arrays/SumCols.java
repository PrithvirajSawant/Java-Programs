package Arrays;
//sum of columns & rows
public class SumCols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,5,3},{12,7,8}};

		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) 
			{
				//sum of rows
//				sum+=arr[i][j];
				//sum of cols
				sum+=arr[j][i];
			}
			System.out.println(sum);
		}
		

	}

}
