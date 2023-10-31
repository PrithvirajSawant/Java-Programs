package OOPS;

class D
{
	static int i = 10;
	public static void m1()
	{
		System.out.println("m1() is D");
	}
}

class X extends D
{
	static int i = 20;
	public static void m1()
	{
		System.out.println("m1() is X");
	}
}

class Vv extends X
{
	static int i = 30;
	public static void m1()
	{
		System.out.println("m1() is Vv");
	}
	public static void m2()
	{
		System.out.println("m1() is Vv");
	}
}

public class methodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new Vv();
		D.m1();
		System.out.println(d.i);

	}

}
