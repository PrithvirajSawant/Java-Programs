package Arrays;
//Rotate a 2D matrix (Transpose)
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,5,3},{12,7,8}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
