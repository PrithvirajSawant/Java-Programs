package Methods;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading z = new Overloading();
		z.m1();
		z.m1(10);
		z.m1(10.0,3);
	}
	public void m1()
	{
		System.out.println("No Arguments");
	}
	public void m1(int a)
	{
		System.out.println("One Formal Argument");
	}
	public void m1(double a,int b)
	{
		System.out.println("Two Formal Arguments");
	}
	
	
	

}
