package OOPS;

public class Blocks {
	Blocks()
	{
		System.out.println("Constructor block");
	}
	
	static
	{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is non-static block"); 
		//It is executed when an instance of the class is created, just before the constructor is invoked.
	}
	
	void m1()
	{
		System.out.println("Method block");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method 1");
		Blocks b = new Blocks();
		b.m1();
		System.out.println("Main method 2");

	}

}
