package Sorting;

public class MergeSort {
	public static void sort(int arr[])
	{
		if(arr.length==1)return; //base case
		int left[]= new int[arr.length/2];
		int right[]= new int[arr.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i] = arr[i];
		}
//		int i=left.length;
		for(int j=0;j<right.length;j++)
		{
//			right[j] = arr[j+i];
			right[j] = arr[j+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,arr);
		
	}
	
	public static void merge(int a[],int b[],int c[])
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length )
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k] = b[j];
				j++;
				k++;
			}
		}
		//left out elements
		while(i<a.length)
		{
			c[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k] = b[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,9,4,3,5,8,0,-1,2,7};
		sort(arr);
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
	}

}
