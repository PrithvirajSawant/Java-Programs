package Sorting;
// Considering 1st element is the smallest & swapping it with the next actual smallest element
// 1 swap per (ith)iteration 
public class selection {
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++)  //n-1 iterations because if 4 elements get sorted i element will already be sorted
		{
			int smallest = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				smallest = j;
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);

	}

}
