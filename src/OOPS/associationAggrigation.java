package OOPS;

import java.util.Scanner;

class Airtel
{
	String name;
	Airtel(){}
	Airtel(String name)
	{
		this.name=name;
	}
	public void calling()
	{
		System.out.println(name +" sim is Dialing");
	}
}

class Jio
{
	String name;
	Jio(){}
	Jio(String name)
	{
		this.name=name;
	}
	public void calling()
	{
		System.out.println(name+" sim is Dialing");
	}
	public void videoCall()
	{
		System.out.println(name+" VideoCall");
	}
}

class Battery
{
	String brand;
	Battery(){}
	Battery(String brand)
	{
		this.brand=brand;
	}
}

class Phone
{
	String brand;
	Airtel airtel;
	Jio jio;
	Battery battery;
	Phone(){}
	Phone(String brand,Battery battery)
	{
		this.brand=brand;
		this.battery=battery;
	}
	public void call()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Sim \n1.Airtel \n2.Jio");
		int selectSim = sc.nextInt();
		if(selectSim==1)
		{
			Airtel airtel = new Airtel("Airtel");
			airtel.calling();
		}
		else if(selectSim==2)
		{
			Jio jio = new Jio("Jio");
			System.out.println("Choose the option : \n1.Call \n2.Videocall");
			int opt = sc.nextInt();
			if(opt==1)
			{
				jio.calling();
			}
			else
			{
				System.out.println("Call from "+brand);
				jio.videoCall();
			}
		}
	}
}


public class associationAggrigation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone("OnePlus", new Battery ("Lipo"));
		p.call();
	}

}

//No Dependency 
