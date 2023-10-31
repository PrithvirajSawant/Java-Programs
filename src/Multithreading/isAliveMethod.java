package Multithreading;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Pgm for isAlive()");
	}
}
public class isAliveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		
		
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println("poinpnmp");

	}

}
