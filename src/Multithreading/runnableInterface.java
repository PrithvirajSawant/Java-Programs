package Multithreading;
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Class");
		}
	}
}
public class runnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r = new B();
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main method");
		}

	}

}
