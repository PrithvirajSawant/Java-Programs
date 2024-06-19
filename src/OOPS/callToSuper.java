package OOPS;
class Aa
{
	int i = 10;
	int j = 20;
//	Aa(){};
	Aa(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public void m1()
	{
		System.out.println(this.i);
		System.out.println(j);
	}
}

class Ba extends Aa
{
	int i = 9;
	int j = 8;

	Ba(int i,int j)
	{               // error is super(i,j) is not called => Implicit super constructor Aa() is undefined. Must explicitly invoke another constructor
		super(i,j); // This line calls the constructor of Aa
		super.i=i;  // i.e, The expression super.i refers to the i data member in the Aa class
		super.j=j;  // The expression i refers to the i data member in the Ba class.  => super.20 = 8 =>8
		this.i=i;   // The expression this.i refers to the i data member in the Ba class  => this.9 = 100 =>100
//		this.j=j;   // The expression i refers to the actual argument of the object b.  => this.0 = 200 =>200
		
	}
	public void m2()
	{
		System.out.println(this.i); // 100
		System.out.println(this.j); //8
		System.out.println(super.i);//100
		System.out.println(super.j);//200
	}
}

public class callToSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a = new Aa(1,2);
		a.m1();
		System.out.println("*****");
		Ba b = new Ba(100,200);
		b.m2();
		System.out.println("*****");
		b.m1();

	}

}
