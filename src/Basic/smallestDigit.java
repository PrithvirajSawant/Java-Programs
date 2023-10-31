package Basic;

public class smallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 451627865;
		int rem = 0;
		int g = 9;
		while(num>0)
		{
			rem=num%10;
			if(rem<g)
			{
				g=rem;
			}
			num/=10;
		}
		System.out.println(g);

	}

}
