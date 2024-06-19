package OOPS;
//we are not implementing abstract class but defining way the abstraction works
class ACar
{
	void start()
	{
		System.out.println("Start");
	}
	
	void acc()
	{
		System.out.println("acc");
	}
	
	void stop()
	{
		System.out.println("Stop");
	}
}

class Kia extends ACar
{
	void start()
	{
		System.out.println(200);
	}
	
	void acc()
	{
		System.out.println("Yes");
	}
	
	void stop()
	{
		System.out.println("3");
	}
	
	void bluetooth()
	{
		System.out.println("bluetooth activated");
	}
}

class Driver 
{
	void drive(ACar car)
	{
		car.start();
		car.acc();
		car.stop();
		
		if(car instanceof Kia)
		((Kia)car).bluetooth();
	}
}
public class abstract_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		d.drive(new ACar());
		System.out.println("*******");
		d.drive(new Kia());

	}

}
