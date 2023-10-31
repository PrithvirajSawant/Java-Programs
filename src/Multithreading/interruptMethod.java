package Multithreading;
class sd extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("t1 thread is running");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted...!");
		}
	}
}
public class interruptMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sd t1 = new sd();
		t1.start();
		t1.interrupt(); // Interrupts the execution after 1000 second 

	}

}
