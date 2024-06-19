package OOPS;

import java.util.HashMap;
import java.util.Map;

public class booking {
//	private static SeatBookingManager obj;

	private Map<String, Map<Integer, Boolean>> availableSeats;

	booking() {
		availableSeats = new HashMap<>();
	}

//	public static SeatBookingManager getInstance() {
//		if (obj == null) {
//			obj = new SeatBookingManager();
//		}
//		return obj;
//	}

	public boolean isSeatAvailable(String movieTitle, int SeatNum) {
		Map<Integer, Boolean> movieSeats = availableSeats.get(movieTitle);
//		if (movieSeats == null) {
////			return false;
//		}
		
		if(!movieSeats.containsKey(SeatNum))
		{
			System.out.println("Seat number not found");
			return false;
		}
		return movieSeats.get(SeatNum);
	}

	public  void bookSeat(String movieTitle, int seatNum) {
		if (!isSeatAvailable(movieTitle, seatNum)) {
			System.out.println("Seat " + seatNum + " is not available for " + movieTitle);
		}
		
		Map<Integer, Boolean> movieSeats = availableSeats.get(movieTitle);
		movieSeats.put(seatNum, false);

	}

	public static void main(String[] args) {
		booking u1 = new booking();
		Map<Integer, Boolean> seat = new HashMap<>();
		seat.put(14, true); // Seat 12 is available
		seat.put(13, true);
		seat.put(15, false);
		seat.put(11, true);
		
		int seatNum = 13;
		
		u1.availableSeats.put("The Avengers", seat);
		boolean isAvailable = u1.isSeatAvailable("The Avengers", seatNum);
		if (isAvailable) {
			u1.bookSeat("The Avengers", seatNum);
			System.out.println("Seat booked successfully for u1.");
		} else {
			System.out.println("Seat not available for u1.");
		}
		
		System.out.println("*************");
		
		booking u2 = new booking();
		u2.availableSeats.put("The Avengers", seat);
		boolean isAvailable2 = u2.isSeatAvailable("The Avengers", seatNum);
		if (isAvailable2) {
			u2.bookSeat("The Avengers", seatNum);
			System.out.println("Seat booked successfully for u2.");
		} else {
			System.out.println("Seat not available for u2.");
		}

	}

}
