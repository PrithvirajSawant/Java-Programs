package OOPS;
abstract class HTML
{
	int a;
	HTML(int i)
	{
		System.out.println("klmkl");

	}
}
class CSS extends HTML
{
	int b =9;
	CSS(int i)
	{
		super(i);
		super.a=i; //10
		this.b=i;  //10
		
	}
}
public class abstractConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSS c = new CSS(10);
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
