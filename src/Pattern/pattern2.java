package Pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 4;
		int star = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
//				System.out.print("*"); //full triangle
				if( j==1||j==star||i==5)  // Left starts|| Right starts|| Bottom starts is this order
				
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

			star+=2;
			space--;
		
		}

	}

}

