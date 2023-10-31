package Methods;

class Father
{
//	int i =100;
	public void marry(int a)
	{
		System.out.println("Marry Emma");
	}
}

class Child extends Father
{
//	int i =100;
//	@Override
	public void marry(int a)
	{
		System.out.println("Marry Shanaya");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.marry(2);
//		Father f = new Child();
//		f.marry(0);

	}

}
//class Animal {
//
//	  public void speak() {
//	    System.out.println("Animal is speaking");
//	  }
//
//	}
//
//	class Dog extends Animal {
//
//	  @Override
//	  public void speak() {
//	    System.out.println("Dog is barking");
//	  }
//
//	}
//
//	public class Overriding {
//
//	  public static void main(String[] args) {
//	    Animal animal = new Animal();
//	    animal.speak(); // Animal is speaking //Overriding
//
//	    Dog dog = new Dog();
//	    dog.speak(); // Dog is barking
//	  }
//
//	}
