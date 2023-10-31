package Strings;

public class jk {
	String brand;
	String price;
	
	public jk(String brand,String price)
	{
		this.brand=brand;
		this.price=price;
	}
	public boolean equalss(Object obj)
	{
		jk e = (jk) obj;
		return this.brand.equals(e.brand) && this.price==e.price;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jk e1 = new jk("realme", "100");
		jk e2 = new jk("realme", "100");
		System.out.println(e1.equalss(e2));
	}

}
