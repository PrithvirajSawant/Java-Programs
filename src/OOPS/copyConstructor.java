package OOPS;

class Student {
	String name;
	final int age;

	Student() {
		age = 12;
	}
	
	Student(int age)
	{
		this.age=age;
	}

	// Copy Constructor
	Student(Student s2) {
		this.name = s2.name;
		this.age = s2.age;
	}
//
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class copyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(); // student() -> constructor
		s1.name = "Aman";
//		s1.age = 24;  //commented as we are using final keyword demo
//		s1.printInfo();

		Student s2 = new Student(s1);
		s2.printInfo();
	}

}

//Java does'nt have Destructors as this operation is done by "garbage collectors", i.e, the objects or memory that are not being used the garbage collector deletes it
