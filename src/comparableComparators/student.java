package comparableComparators;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
//import java.util.*;
//import comparableComparators.student.sortNameThenMarks;
public class student implements Comparable<student>  {
	
	private int marks;
	private String name;
	
	public student(int marks, String name)
	{
//		super();
		this.marks=marks;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "Student [marks = " +marks+ ", name = " +name+ "]";
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
//	@Override
//	public int compareTo(student o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> std = new ArrayList<>();
		
		std.add(new student(35,"Ram"));
		std.add(new student(35,"Rvj"));
		std.add(new student(83,"Prithvi"));
		std.add(new student(13,"Karan"));
		std.add(new student(65,"Arjun"));
		
		Collections.sort(std);
		
//		std.forEach(System.out::println);
		
		for(student n:std)
		{
			System.out.println(n);
		}
		
	
	}
	
	
	@Override
	public int compareTo(student obj) {
//		if(this.getName().equals(obj.getName()))
//		{
//			return this.getMarks()-obj.getMarks();   // increasing order
//		}
//		else
//			return this.getName().compareTo(obj.getName());
		
		// TODO Auto-generated method stub
		if(this.marks>obj.marks)                
			return -1;                          // in Decreasing Order
//			return this.marks-obj.marks;        // in Increasing Order
		else if(this.marks<obj.marks)
			return 1;
		return 0;
//		
		//if we need to compare by names, i.e, if marks are same compare them by names 
//		return this.name.compareTo(obj.name);
	}

}

//class sortNameThenMarks implements Comparator<student>
//{
//
//	@Override
//	public int compare(student o1, student o2) {
//		// TODO Auto-generated method stub
//		if(o1.name.equals(o2.name))
//		{
//			return o1.marks-o2.marks;
//		}
//		else
//			return o1.name.compareTo(o2.name);
////		return 0;
//	}
//	
//}


// *** The compareTo() method in the student class is used to compare two student objects. The obj parameter is the other student object that is being compared to the current student object. The this.marks variable is the marks of the current student object.

// The compareTo() method first compares the marks of the two student objects. If the current student object has "higher marks" than the other student object, the compareTo() method returns -1. This means that the "current student object should be placed before the other student object" in the sorted list. (i.e, Decreasing Order)

// Q). this.marks i.e, the current student marks is being compared to all other student marks at a single time i.e, student obj?

//ANS: No, the this.marks variable is not being compared to all other student marks at a single time. The compareTo() method is called one student object at a time. The this.marks variable is compared to the obj.marks variable of the other student object that is being called.

//For example, if the std list contains the following student objects:

//student s1 = new student(35, "Ram");
//student s2 = new student(35, "Rvj");
//student s3 = new student(83, "Prithvi");
//student s4 = new student(13, "Karan");
//student s5 = new student(65, "Arjun");

// *** The compareTo() method will be called first for the s1 object and the obj parameter will be the s2 object. The this.marks variable of the s1 object will be compared to the obj.marks variable of the s2 object. If the this.marks variable of the s1 object is greater than the obj.marks variable of the s2 object, the compareTo() method will return -1. This means that the s1 object should be placed before the s2 object in the sorted list.
//The compareTo() method will then be called for the s2 object and the obj parameter will be the s3 object. The this.marks variable of the s2 object will be compared to the obj.marks variable of the s3 object. If the this.marks variable of the s2 object is equal to the obj.marks variable of the s3 object, the compareTo() method will return 0. This means that the s2 object and the s3 object are equal and can be placed in any order in the sorted list. //
