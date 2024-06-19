package Collection2;

import java.util.HashMap;
import java.util.Map;

public class maps {
	
	public static void main(String[] args) {
		Map<String, Map<Integer,Boolean>> s = new HashMap<>();
		Map<Integer, Boolean> availableSeats = new HashMap<>();
//		availableSeats.put(12, true); // Seat 12 is available
//		availableSeats.put(13, false); // Seat 13 is not available
//		s.put("qfe", availableSeats);
		s.put("qfe", null);
//		System.out.println(s.get("qfe"));
//		System.out.println(s.get("qfe"));
		if(s.containsValue(null))
		{
			System.out.println("***");
		}
//		s.put("awgf", 123 true);
		
	}
	
	

}
