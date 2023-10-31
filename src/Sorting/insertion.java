package Sorting;
// Considering the 1st element of an array is sorted & inserting the actual sorted element with
//the considered sorted element by pushing the considered sorted elements that are unsorted by 1 position forward.
public class insertion {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,8,3,1,2};
		for(int i=1;i<arr.length;i++)
		{
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		printArray(arr);

	}

}
