package Sorting;

public class bubble {
	
	public static void printArray(int arr[])
	{
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++)
		{
//			System.out.println(i); no need for the 5th iteration as the remaining 1 element will be sorted automatically 
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])//Ascending  //if(arr[j]<arr[j+1])//Descending
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
//		bubble.printArray(arr);
		printArray(arr);

	}

}
