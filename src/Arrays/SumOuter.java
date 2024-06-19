package Arrays;

public class SumOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,5,3},{12,7,8}};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0||j==0||j==arr.length-1|i==arr.length-1) //Top //left //Right //Bottom
				{
					sum+=arr[i][j];
				}
//				System.out.print(arr[j][i]); //T
			}
//			System.out.println(); //T
		}
		System.out.println(sum);
		

	}

}
//WAP to find the avg of the elements