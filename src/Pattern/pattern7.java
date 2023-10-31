package Pattern;
//4
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 2;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			for(int j=i;j<=space;j++)
			{
				System.out.print(i);
			}
			space+=3;
//			System.out.println(space);
		}
 
	}

}
