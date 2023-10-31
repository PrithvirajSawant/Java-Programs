package Sorting;
//The conquer() method in the Merge class is used to merge two sorted subarrays into a single sorted array. The method takes three parameters:

//arr: The original array containing the two subarrays to be merged.
//start: The index of the first element in the left subarray.
//end: The index of the last element in the right subarray.
public class Merge {
	public static void conquer(int arr[], int start, int mid, int end)
	{
		int merged[] = new int[end - start +1];
		
		int idx1 = start;
		int idx2 = mid+1;
		int x = 0;
		
		while(idx1<=mid && idx2<=end)
		{
			if(arr[idx1]<=arr[idx2])
			{
				merged[x++] = arr[idx1++];
			}
			else
			{
				merged[x++] = arr[idx2++];
			}
		}
		
		while(idx1<=mid)
		{
			merged[x++] = arr[idx1++];
		}
		
		while(idx2<=end)
		{
			merged[x++] = arr[idx2++];
		}
		
		for(int i=0, j= start; i<merged.length; i++, j++)
		{
			arr[j] = merged[i];
		}
	}
	//The divide() method in the Merge class is used to recursively divide the original array 
	//into smaller subarrays until they are small enough to be sorted directly. The method takes two parameters:
	public static void divide(int arr[], int start, int end)
	{
		if(start>=end)
		{
			return; //The method first checks if the array is small enough to be sorted directly. 
			       //If it is, the method simply sorts the array and returns.
		}
		int mid = start + (end-start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid, end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,3,9,5,2,8};
		int n = arr.length;
		
		divide(arr, 0, n-1);
		
		//print
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
