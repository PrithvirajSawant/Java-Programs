package Strings;

public class toString {
	String brand;
	int price;
	public toString(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "Brand = "+brand+" Price = "+price;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toString t = new toString("Realme",5000);
//		t.tostring();
		System.out.println(t.toString());
	}

}

