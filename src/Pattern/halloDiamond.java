package Pattern;

public class halloDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 4;
		int star = 1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
//				System.out.print("*");
				if(j==1||j==star)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<10/2)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}
		}

	}

}
