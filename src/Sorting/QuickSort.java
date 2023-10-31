package Sorting;

public class QuickSort {
	
	public static void sort(int arr[],int start,int end)
	{
		if(start>end)return;
		int i = start;
		int j = end;
		int pivot = arr[(start+end)/2];
		while(i<=j)
		{
			while(arr[i]<pivot)i++;
//			System.out.println(i);
//			System.out.println(arr[i]);
			while(arr[j]>pivot)j--;
			if(i<=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
//				System.out.println(pivot);
			}
//			System.out.println(pivot);
		}
		sort(arr,start,j); // Sorts left part and j is the rightmost of the left hand side. | start is constant i.e, start = 0
//		System.out.println(j);
//		System.out.println(end);
//		System.out.println(j+" "+end+"="+arr[end]);
		sort(arr,i,end); // Sorts right part and i is the leftmost of the right hand side. | end is constant i.e, end = arr.length-1.

//		System.out.println(pivot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,7,8,-1,6,0};
		sort(arr,0,arr.length-1);
		for(int e:arr)
		{
			System.out.print(e+" ");
		}

	}

}
//check 2 array same or not
//remove duplicate elements in array
