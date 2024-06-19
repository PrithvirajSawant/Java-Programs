package Basic;
// Also known as GCD
public class HCF {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 18;
		int res = n1<n2?n1:n2;
		int store = 0;
		for(int i=1;i<=res;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				store=i;
			}
		}
		System.out.println(store);
	}

}
