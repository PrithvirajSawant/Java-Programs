package OOPS;
class AD
{
	void showAD()
	{
		System.out.println("AD class visible");
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AD a = new AD()
				{
			void showAD()
			{
				System.out.println("Anonymous class created");
			}
				};
				a.showAD();

	}

}
