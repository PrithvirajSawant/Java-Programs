package Multithreading;

class Task extends Thread
{
	@Override
	public void run() {
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Output : " + i);  //2
			}
			System.out.println("Child thread sending notification");  //3
			this.notify();
		}
	}
}
public class waitNotifyOC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task t = new Task();
		t.start();
		synchronized(t)
		{
			System.out.println("Trying to call wait method"); //1
			t.wait(1000);
			System.out.println("Main Thread got the notification"); //4
		}

	}

}
