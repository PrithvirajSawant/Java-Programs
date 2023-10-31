package OOPS;

class K
{
	int i = 10;
	int j = 20;
	K(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public void m1()
	{
		System.out.println(this.i);
		System.out.println(this.j);
	}
}
class L extends K
{
	
	int i = 100;
	int j = 200;
	L(int i,int j)
	{
		super(i,j);
	}

	public 	void m2()
	{
		System.out.println(this.i);
		System.out.println(super.j);
	}
}

public class superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L l = new L(12,21);
		l.m2();
		System.out.println("*****");
		l.m1();

	}

}
