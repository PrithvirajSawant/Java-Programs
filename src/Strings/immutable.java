package Strings;

class Engine
{
	int speed ;
	Engine(int speed)
	{
		this.speed=speed;
	}
}
public final class immutable {
	private final int id;
	private final String name;
	private final Engine engine;
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public immutable(int i,String s,Engine e)
	{
		this.id=i;
		this.name=s;
		Engine newEngine = new Engine(e.speed); //deep cloning
		this.engine=newEngine;
//		this.engine=e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine(50);
		immutable i = new immutable(10, "Raj", e);
//		i.id=45; //The final field immutable.id cannot be assigned
		e.speed=30;
		System.out.println(i.id);
		System.out.println(i.name);
		System.out.println(i.engine.speed);
		
		

	}

}
