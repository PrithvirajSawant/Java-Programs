package Multithreading;

class df extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		df t1 = new df();
		df t2 = new df();
		df t3 = new df();
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.setPriority(1);  //Priority 3
		t2.setPriority(6);  //Priority 2
		t3.setPriority(10); //Priority 1
		
		t1.start();
		t2.start();
		t3.start();

	}

}
