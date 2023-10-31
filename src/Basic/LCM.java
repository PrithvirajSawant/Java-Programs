package Basic;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
//		int lcm, i;
		int res = a>b?a:b;
//		System.out.println(res);
		for(int i=res;i<=a*b;i+=res)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println(i);
				break;
			}
		}
//		lcm = i;
//		System.out.println(i);
		

	}

}
