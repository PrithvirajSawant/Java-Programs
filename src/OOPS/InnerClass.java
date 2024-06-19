package OOPS;
class AC
{
	int a = 10;
	void showA()
	{
		System.out.println("A class data displayed");
	}
	static class BS
	{
		void showB()
		{
			System.out.println("B class data displayed");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC obj = new AC();
		obj.showA();
		
//		AC.BS b = obj.new BS();
//		b.showB();
		
		//if inner class is static
		AC.BS b = new AC.BS();
		b.showB();

	}

}
