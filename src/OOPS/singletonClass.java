package OOPS;
// Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching,
// thread pools, configuration settings etc.
// 1. Private constructor to restrict instantiation of the class from other classes.

// 2. Private static variable of the same class that is the only instance of the class.

// 3. Public static method that returns the instance of the class, this is the global access point for outer world
// to get the instance of the singleton class.

public class singletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj = abc.getInstance();
		abc obj1 = abc.getInstance();
//		
//		String name = obj.name;   // dot notation without using method
//		System.out.println(name); // o/p: null
//		
//		String name = obj.getName(); // by creating method getName & setName
//		System.out.println(name); // o/p: abc
		
//		
//		abc obj1 = new abc();
	}

}
class abc
{
	static abc obj; //if null then line 39 to 42
	
	private abc() // don't allow user to create an instance with default constructor
	{
		System.out.println("Instance created");
	}
	public static abc getInstance()
	{
		if(obj==null)  // if obj is null i.e, [ static abc obj = null; ] Lazy initialization
		{
			obj = new abc();
		}
//		System.out.println("Same hashCode: "+obj.toString());
//		obj.setName("abc");
		
		return obj;
	}
	
//	String name ;
//	public String getName()
//	{
//		return name ;
//	}
//	public void setName(String name)
//	{
//		this.name = name ;
//	}
}
