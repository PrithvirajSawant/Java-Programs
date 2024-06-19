package comparableComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortNameThenMarks implements Comparator<student>
{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		if(o1.getName().equals(o2.getName()))
		{
			return o1.getMarks()-o2.getMarks();   // increasing order
		}
		else
			return o1.getName().compareTo(o2.getName());
//		return 0;
	}
	
}
public class comparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> std = new ArrayList<>();
		
		std.add(new student(35,"Ram"));
		std.add(new student(36,"Bhuan"));
		std.add(new student(83,"Arun"));
		std.add(new student(13,"Ram"));   
		std.add(new student(65,"Arjun"));
		
		Collections.sort(std, new sortNameThenMarks());
		
//		method - 2 (without creating "sortNameThenMarks class")
//		Collections.sort(std, new Comparator<student>() {
//
//			@Override
//			public int compare(student o1, student o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
		
		std.forEach(System.out::println); //scope resolution operator

	}

}
