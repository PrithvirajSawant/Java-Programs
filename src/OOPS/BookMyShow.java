package OOPS;
//Example of Singleton
class Theater
{
	int seats = 50;
	static Theater t; 
	
	private Theater()
	{
		
	}
	
	public static Theater getInstance()
	{
		if(t==null) //Lazy initialization
		{
			t = new Theater();
		}
		return t;
	}
	
	public void reserveTickets(int numOfSeats)
	{
		if(numOfSeats>seats)
		{
			System.out.println("Not Available, only "+seats+" seats are available");
			return;
		}
		else
		{
			seats = seats-numOfSeats;
			System.out.println(numOfSeats+" are reserved");
		}
	}
}
class bookingApp
{
	public void bookTickets()
	{
		int tickets = 19;
		
		Theater obj = Theater.getInstance(); // Every method call the same instance is accessed
		obj.reserveTickets(tickets);
	}
}
public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookingApp user1 = new bookingApp();
		user1.bookTickets();
		bookingApp user2 = new bookingApp();
		user2.bookTickets();
		bookingApp user3 = new bookingApp();
		user3.bookTickets();

	}

}
