package Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = {5,2,7,4};
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
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("Duplicate element: " + c[i]);
				}
			}
		}

	}

}
