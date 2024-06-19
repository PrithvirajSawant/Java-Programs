package Pattern;
//2
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 8;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=space;j++)
			{
				System.out.print(j);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}

	}

}