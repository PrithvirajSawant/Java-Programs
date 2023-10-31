package Multithreading;

 class T extends Thread 
{
//	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Name");
		}
	}
}
public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T a = new T();
		a.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Prithviraj");
		}
		

	}

}
