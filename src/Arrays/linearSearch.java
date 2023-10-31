package Arrays;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int brr[] = new int[5];
//		brr[0]=9;
//		brr[1]=9;
//		brr[2]=9;
//		brr[3]=9;
//		brr[4]=9;
////		brr[5]=9;
//		for(int i =0;i<brr.length;i++)
//		{
//			System.out.print(brr[i]);
//		}
//		System.out.println();
		
		int [] arr= {10,20,30,40,50};
		int key = 30;
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				count++;
				System.out.println("Element found");
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Element not found");
		}

	}

}
