package Methods;

class H
{
	private int i =10;
	public int j = 20;
	public void access()
	{
		System.out.println("Private can't be accessed");
	}
}
public class privateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H h = new H();
//		System.out.println(h.i); //We can't access as it is Private
		System.out.println(h.j +" is Public");
		h.access();

	}

}
