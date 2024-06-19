package OOPS;
//Multiple Inheritance using Interface 
interface I1
{
	void m1(); //only public, private, abstract, default, static and strictfp are permitted
}
interface I2 
{
	void m1();
}
class c implements I1,I2
{
	@Override
	public void m1()
	{
		System.out.println("m1() method");
	}

//	@Override
//	public void m2() {
//		// TODO Auto-generated method stub
//		
//	}
}

public class interfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i = new c();
		i.m1();
		I2 i2 = new c();
		i2.m1();

	}

}
