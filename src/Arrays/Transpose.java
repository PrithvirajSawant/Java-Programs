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
		
		//rotate by 90 degree
		 int[][] rotatedArray = new int[arr[0].length][arr.length];
		// Transpose the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rotatedArray[i][j] = arr[j][i];
            }
        }

        // Reverse the elements in each row of the rotated array
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length / 2; j++) {
                int temp = rotatedArray[i][j];
                rotatedArray[i][j] = rotatedArray[i][rotatedArray[i].length - 1 - j];  //rotatedArray[0][0] = 12;
                rotatedArray[i][rotatedArray[i].length - 1 - j] = temp;                //rotatedArray[0][2] = 1;
            }
        }

        // Print the rotated array
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }

	}

}
