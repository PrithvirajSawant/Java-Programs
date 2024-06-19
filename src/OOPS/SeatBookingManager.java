package OOPS;

import java.security.DomainCombiner;
import java.util.HashMap;
import java.util.Map;

public class SeatBookingManager {
	private static SeatBookingManager obj;

	private Map<String, Map<Integer, Boolean>> availableSeats;

	private SeatBookingManager() {
		availableSeats = new HashMap<>();
	}

	public static SeatBookingManager getInstance() {
		if (obj == null) {
			obj = new SeatBookingManager();
		}
		return obj;
	}

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
		SeatBookingManager user = SeatBookingManager.getInstance();
		Map<Integer, Boolean> seat = new HashMap<>();
		seat.put(14, true); // Seat 12 is available
		seat.put(13, true);
		seat.put(15, false);
		seat.put(11, true);
		
		int seatNum = 13;
		
		user.availableSeats.put("The Avengers", seat);
		boolean isAvailable = user.isSeatAvailable("The Avengers", seatNum);
		if (isAvailable) {
			user.bookSeat("The Avengers", seatNum);
			System.out.println("Seat booked successfully for user-1.");
		} else {
			System.out.println("Seat not available for user-1.");
		}
		
		System.out.println("*************");
		
		SeatBookingManager user2 = SeatBookingManager.getInstance();
		user2.availableSeats.put("The Avengers", seat);
		boolean isAvailable2 = user2.isSeatAvailable("The Avengers", seatNum);
		if (isAvailable2) {
			user2.bookSeat("The Avengers", seatNum);
			System.out.println("Seat booked successfully for user-2.");
		} else {
			System.out.println("Seat not available for user-2.");
		}

	}

}
