package ExceptionHandling;

class IE extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("This is eg for :");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("hbkjblk");
		}
		
	}
}
public class multithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		IE t = new IE();
		t.start();
//		t.interrupt();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Interrupted Exception");
			Thread.sleep(1000);
		}
	}

}
