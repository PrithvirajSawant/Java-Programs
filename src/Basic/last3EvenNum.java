package Basic;

public class last3EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=100;i>=1;i--)
		{
			if(i%2==0 && count<3)
			{
				System.out.println(i);
				count++;
			}
		}

	}

}
