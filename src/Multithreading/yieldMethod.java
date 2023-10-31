package Multithreading;

class thread0 extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
			Thread.yield();
		}
	}
}
class thread2 extends Thread
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
public class yieldMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread0 t1 = new thread0();
		thread2 t2 = new thread2();
		t1.start();
		t2.start();
		
		

	}

}
