package OOPS;


// for interfaceDemo
public class demo implements interfaceDemo{
	@Override
	public void m12()
	{
		System.out.println("First Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceDemo d  = new demo();
		d.m12();
		interfaceDemo s = new ss();
		s.m12();
		
		

	}

}
class ss implements interfaceDemo
{

	@Override
	public void m12() {
		// TODO Auto-generated method stub
		System.out.println("called by ss");
		
	}
	
}
