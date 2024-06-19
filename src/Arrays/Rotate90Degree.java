package Arrays;

public class Rotate90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,9},{6,5,3},{12,7,8}};
		
		int[][] rotatedArray = new int[arr[0].length][arr.length];
//		The original array array has dimensions arr.length (number of rows) and arr[0].length (number of columns). 
//		When we transpose the array, we swap the rows and columns, resulting in a new array with dimensions arr[0].length (number of new rows) and arr.length (number of new columns).
		
		// Transpose the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rotatedArray[j][i] = arr[i][j];
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
