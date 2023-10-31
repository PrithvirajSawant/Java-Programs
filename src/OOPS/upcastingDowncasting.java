package OOPS;

class Ram
{
	public static void m1()
	{
		System.out.println("Hi Ram");
	}
	public static void m2()
	{
		System.out.println("Hello Ram");
	}
}

class Raj extends Ram
{
	public static void  m1()
	{
		System.out.println("Hi Raj");
	}
	public static void m3()
	{
		System.out.println("Hello Raj");
	}
}

public class upcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raj r = new Raj();
		r.m1();
		r.m2();
		r.m3();
		System.out.println("*****");
		Ram rr = new Raj();
		rr.m1();
		rr.m2();
		System.out.println("*****");
		Raj r2 = (Raj)rr;
		r2.m1();
		r2.m2();
		r2.m3();

	}

}
