package Multithreading;
class Bank extends Thread
{
	static int balance = 5000;
	static int withdraw;
	Bank(int withdraw)
	{
		this.withdraw=withdraw;
	}
	public static synchronized void withDraw() // we cannot write run() over here because it is an overridden method , we cannot override static method
	{
		String name = Thread.currentThread().getName();
		if(withdraw<=balance)
		{
			System.out.println(name + " Withdrawed money");
			balance-=withdraw;
		}
		else
		{
			System.out.println("Insufficient Balance !!");
		}
	}
	public void run()
	{
		withDraw();
	}
}
public class staticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj1 = new Bank(5000);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);
		
		t1.setName("Alex");
		t2.setName("Joy");
		
		Bank obj2 = new Bank(5000);
		
		Thread t3 = new Thread(obj2);
		Thread t4 = new Thread(obj2);
		
		t3.setName("Ajax");
		t4.setName("Alice");
		
		t1.start(); t2.start(); t3.start(); t4.start();
		
		

	}

}
