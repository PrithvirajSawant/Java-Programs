package OOPS;
class B
{
	static int a; // static member
	final int b;  // non-static member
	static
	{
		a = 100;
		System.out.println(a);
//		System.out.println(b); // we cannot make a static reference to a non-static field b
	}
	static
	{
		System.out.println("Hi");
	}
	{
		b=10;
		System.out.println("Non-Static Block from class B");
		System.out.println(a); //But we can make a non-static reference to a static field a
//		b=19; // final data members cannot be reassigned 
		System.out.println(b);
	}
	static // This block will execute before the previous non-static block
	{
		System.out.println("Static Block from class B");
	}
}

public class nonStaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println("Main");

	}

}
