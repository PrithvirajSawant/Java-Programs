package Arrays;
//reversing an array by swapping. (2-Pointer method)
import java.util.Arrays;

public class ReverseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8,9,10};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	static void swap(int[] arr, int idx1, int idx2)
	{
		int temp = arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
	}
	
	static void reverse(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
	}

}
