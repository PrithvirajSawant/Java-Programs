package Multithreading;
class C extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
	}
}
public class join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C t1 = new C();
		C t2 = new C();
		C t3 = new C();
		
		t1.setName("Task 1");
		t2.setName("Task 2");
		t3.setName("Task 3");
		
		t2.start(); // For execution before t1 & t2
		try
		{
			t2.join(); //This will always execute at once & 1st as it t2.start() is written at the beginning
		}
		catch(InterruptedException e)
		{
			
		}
		t1.start();
		t3.start();

	}

}
