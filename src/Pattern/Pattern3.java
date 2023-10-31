package Pattern;

public class Pattern3 {
public static void main(String[] args) {
//	int space = 4;
	int star = 1;
	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("* ");		
		}
		System.out.println();
		if(i<9/2)
		{
			star++;
		}
		else
		{
			star--;
		}
	}
  }

}
