package Multithreading;

class Bus implements Runnable
{
	int available = 2, sPerPassenger;
	Bus(int sPerPassenger)
	{
		this.sPerPassenger=sPerPassenger;
	}
	public synchronized void run()
	{
		String name = Thread.currentThread().getName();
		if(available>=sPerPassenger)
		{
//			System.out.println(available);
			System.out.println("Seat reserved for " + name);
			available--;
//			System.out.println(available);
		}
		else
		{
			System.out.println("No seats are available");
		}
	}
}
public class syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus r = new Bus(1); 
//		Bus r2 = new Bus();
//		Bus r3 = new Bus();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Ram");
		t2.setName("Shyam");
		t3.setName("Rahul");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
