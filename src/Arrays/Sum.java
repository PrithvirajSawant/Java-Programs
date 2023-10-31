package Arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30};
		int b[] = {10,20,30,50};
		int c=a.length;
		int d=b.length;
		int res = c>d?c:d;
		int arr[] = new int[res];
		int i=0;
		while(i<a.length && i<b.length )
		{
			arr[i]=a[i]+b[i];
			i++;
		}
		while(i<a.length)
		{
			arr[i]=a[i];
			i++;
		}
		while(i<b.length)
		{
			arr[i]=b[i];
			i++;
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
	

}
