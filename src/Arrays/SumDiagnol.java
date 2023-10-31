package Arrays;

public class SumDiagnol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,5,3},{12,7,8}};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				if(i==j||i+j==arr.length-1)
				{
					sum+=arr[i][j];
				}
//				else if(i+j==arr.length-1)
//				{
//					sum+=arr[i][j];
//				}
			}
		}
		System.out.println(sum);

	}

}
