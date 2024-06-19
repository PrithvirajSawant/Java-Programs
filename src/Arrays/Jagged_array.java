package Arrays;
//Jagged Arrays are special types of Multidimensional arrays which have variable number of columns.
public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr = new int [3][]; //jagged array
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		int val = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = val++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
