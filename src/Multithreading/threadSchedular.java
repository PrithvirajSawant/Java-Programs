package Multithreading;
class V extends Thread
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
public class threadSchedular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V t1 = new V();
		V t2 = new V();
		V t3 = new V();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
		String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
		

	}

}
