package OOPS;
//call to this()   
class Food
{
	String name;
	int quantity;
	double price;
	
	Food()
	{
		System.out.println("Food is tasty");
	}
	
	Food(String name)
	{
		this();
		this.name=name;
	}
	Food(String name, int quantity)
	{
		this(name);
		this.quantity=quantity;
	}
	Food(String name, int quantity, double price)
	{
		this(name,quantity);
		this.price=price;
	}
//	Food(String name, int quantity, double price) {
//		this();
//		this.name = name;
//		this.quantity = quantity;
//		this.price = price;
//	}

	public void display()
	{
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
	}
}


public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Food("Pasta",1,400.00);
		f.display();

	}

}
