package OOPS;

abstract class Vehical
{
	public abstract void m1();
	public abstract void m2();
	public static void m3()  // We can declare static methods in abstract class 
	{
		System.out.println("m3() method");
	}
	Vehical()
	{
		System.out.println("Vehical constructor");
	}
	
}
abstract class Car extends Vehical
{
	Car()
	{
		System.out.println("Car constructor");
	}
	@Override
	public void m1()
	{
		System.out.println("m1() method");
	}
	public abstract void m4();
}
 
class Bike extends Car
{
	Bike()
	{
//		super();
		System.out.println("Bike constructor");
	}
	public void m1()
	{
		super.m1();
		System.out.println("m1() method in bike class");
	}
	@Override
	public void m2()
	{
		System.out.println("m2() method");
	}
	@Override
	public void m4()
	{
		System.out.println("m4() method");
	}
	
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Bike();  //Anonymous object
		Vehical v = new Bike(); // We cannot create an object for abstract so we define a class and create a new object with the class & store it in the reference of the abstract class.
		v.m1();
		v.m2();

	}

}
