package Arrays;
//Highest number in a 2D array
import java.util.Arrays;

public class Max2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,50,3},{12,7,8}};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				//For checking the greatest no. among all the rows
				if(arr[i][j]>max)
				{
					max=arr[i][j];
					
				}
//				System.out.print(arr[j][i]+" "); //transpose
				//For checking the greatest no. in the 1st column
//				if(arr[j][i]>max)
//				{
//					max=arr[j][i];
//					
//				}
				
			}
//			System.out.println(); //use while transpose
//			break;
//			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("Max = "+max);
//		System.out.println(Integer.MIN_VALUE);

	}

}
