package project;

import java.util.ArrayList;
import java.util.Scanner;
class Fruit
{
	private String name;
	private String taste;
	private double price;
	
	public Fruit(String name, String taste, double price) {
//		super();
		this.name = name;
		this.taste = taste;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", taste=" + taste + ", price=" + price + "]";
	}
	
	

	
}
class Bag
{
	ArrayList<Fruit> f = new ArrayList<>();
	
	public void addFruit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of fruit");
		String name = sc.next();
		System.out.println("Enter taste");
		String taste = sc.next();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		
		Fruit fruit = new Fruit(name,taste,price);
		
		f.add(fruit);
		
//		sc.close(); // do not implement returns exception java.util.NoSuchElementException
	}
	
	public void removeFruit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name");
		String name  = sc.next();
		for(int i=0;i<f.size();i++)
		{
			if(name.equals(f.get(i).getName()))
			{
				f.remove(i);
				System.out.println("Fruit removed successfully");
			}
		}
	}
	
	public void display()
	{
		System.out.println("List of fruits in the bag");
		for(Fruit fruit : f)
		{
			System.out.println(fruit.toString());
		}
		if(f.size() == 0)
		{
			System.out.println("ZERO : Bag empty");
		}
//		for(int i=0;i<f.size();i++)
//		{
//			Fruit fruit = f.get(i);
//			System.out.println(fruit.toString());
//			System.out.println("-----------------------------------------------");
//		}
		
	}
	
	public void contains()
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the fruit");
		String name  = sc.next();
		for(int i=0;i<f.size();i++)
		{
			if(name.equals(f.get(i).getName()))
			{
				count++;
				System.out.println(name+" is available in the bag");
				break;
			}
		}
		if(count==0)System.out.println("Not fount");
	}
	
}
public class FruitBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag b = new Bag();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			
			System.out.println("1.AddFruit\n2.RemoveFruit\n3.Display\n4.SearchFruit\n5.exit");
			System.out.println("-----------------------------");
			int key = sc.nextInt();
			switch (key) 
			{
			case 1: 
			{
				Scanner s = new Scanner(System.in);
				System.out.println("How many Fruits you want to enter");
				int n = s.nextInt();
				for(int i =1;i<=n;i++)
				{
					b.addFruit();
				}
				
			}
			break;
			case 2:
			{
				b.removeFruit();
			}
			break;
			case 3:
			{
				b.display();
			}
			break;
			case 4:
			{
				b.contains();
			}
			break;
			case 5:
			{
				flag = false;
				
			}
			break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
			
		}
		
	}

}
