package Arrays;
//Binary search will only work when the elements in an array are in sorted order.
public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,9,14,21,24,30,60};
//		arr = new int []{6,9,14,21,24,30,60};
		int key = 24;
		int start  = 0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==key)
			{
				System.out.println(arr[mid]);
				System.out.println("Element found");
				break;
			}
			else if(key>arr[mid])
			{
				start = mid+1;
			}
			else
				end=mid-1;
		}
		if(start>end)
		{
			System.out.println("Element not found");
		}

	}

}
