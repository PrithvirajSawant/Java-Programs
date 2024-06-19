package OOPS;
class Animal
{
	String name;
	Animal(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	void parentMethod()
	{
		System.out.println("This is parent calss");
	}
}
class Dog extends Animal
{
	String breed;
	Dog(String name,String breed)
	{
		super(name); //chaining reduces code (or)code reusability
		this.breed=breed;
	}
	
	@Override
	public String getName()
	{
		return "name: "+ name +" ,"+" breed: "+breed;
	}
	
	void childMethod()
	{
		System.out.println("This is child class");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Charlie");
		System.out.println(a.getName()); //Charlie
		System.out.println("********");
		
		Dog d = new Dog("Charlie","Golden Retriver");
		System.out.println(d.getName()); //name: Charlie breed: Golden Retriver
		System.out.println("*********");
		
		System.out.println("Up-Casting");
		Animal aa = new Dog("Brad","Husky"); //Up casting - we access only parent class properties and overridden methods of subclass.
		System.out.println(aa.getName()); //name: Brad breed: Husky //we got this out put as the method name is overridden in subclass, else the o/p: would be "Brad"
		aa.parentMethod();
//		aa.childMethod();//not accessible via Up-Casting
		System.out.println("*********");
		
		System.out.println("Down-Casting");
		Dog dd = (Dog)aa;
		System.out.println(dd.getName());
		dd.parentMethod(); //Both parent class & child class properties are accessible
		dd.childMethod();
	}

}
