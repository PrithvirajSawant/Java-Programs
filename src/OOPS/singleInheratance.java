package OOPS;

class S
{
	public void m1()
	{
		System.out.println("Parent Class");
	}
}

class V extends S
{
	public void m2()
	{
		System.out.println("Child Class");
	}
}

public class singleInheratance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V v = new V();
		v.m1();
		v.m2();

	}

}
