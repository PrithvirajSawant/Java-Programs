package OOPS;

class H
{
	public void m1()
	{
		System.out.println("m1() of Class H");
	}
}

class J extends H
{
	public void m1()
	{
		System.out.println("m1() of J");
		super.m1();
	}
	public void m2()
	{
		this.m1();
		super.m1();
	}
}

//class Driver
//{
//	public void drivee(H h)  // 
//	{
//		System.out.println("To access un-comment line 40 & 41");
//		h.m1();
//	}
//}

public class superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J j = new J();
		j.m2();
//		Driver drive = new Driver();
//		drive.drivee(new J()); // Up casting i.e, H h = new J();

	}

}
