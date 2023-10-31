package Multithreading;

class Table
{
	public synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}
class th1 extends Thread
{
//	Table t = new Table();
	Table t;
	th1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class th2 extends Thread
{
	Table t;
	th2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(7);
	}
}
public class methodSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table(); 
		
		th1 t1 = new th1(obj);
		th2 t2 = new th2(obj);
		
		t1.start();   t2.start();

	}

}
