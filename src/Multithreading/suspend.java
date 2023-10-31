package Multithreading;

class D extends Thread
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
public class suspend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D t1 = new D();
		D t2 = new D();
		D t3 = new D();
		
		t1.setName("Task 1");
		t2.setName("Task 2");
		t3.setName("Task 3");
		
		t1.start();
		t2.start();
		t2.suspend(); //Deprecated 
		t3.start();
		t2.resume();  //Deprecated

	}

}
