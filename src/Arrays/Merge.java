package Arrays;
//1. Merge 2 Arrays
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int size = a.length+b.length;
		int c[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
