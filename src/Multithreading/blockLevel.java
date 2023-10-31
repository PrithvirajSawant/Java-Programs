package Multithreading;

class msg
{
	public void show(String name)
	{
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Name is "+ name);
			}
		}
	}
}
class ourThread extends Thread
{
	msg m;
	String name;
	ourThread(msg m, String name)
	{
		this.m=m;
		this.name=name;
	}
	public void run()
	{
		m.show(name);
	}
}
public class blockLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msg obj = new msg();
		
		ourThread t1 = new ourThread(obj,"Akash");
		ourThread t2 = new ourThread(obj,"Bijus");
		
		t1.start(); t2.start();
		
		

	}

}
