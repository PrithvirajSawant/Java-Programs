package OOPS;
class pen
{
	String brand;
	String color;
	int price;
	pen()
	{
//		System.out.println("To use me, UnComment call to this");  //this() is calling another within same class 
	}
	pen(String brand, String color, int price)
	{
//		this();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public void penDetails()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}
public class thisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen p = new pen("Cello","Black",2000);
		p.penDetails();
	}

}
