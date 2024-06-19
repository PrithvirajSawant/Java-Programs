package Arrays;

import java.util.Arrays;

public class Student implements Comparable {
	String name ;
	int id;
	int age;
	char grade;
	
	public Student(String name, int id, int age, char grade) {
//		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", grade=" + grade + "]";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Ram",1,25,'C');
		Student s2 = new Student("Sita",3,20,'A');
		Student s3 = new Student("Virat",10,18,'B');
		Student s4 = new Student("Lucky",0,22,'D');
		Student s5 = new Student("Arjun",5,23,'F');
		
		Student[] s = {s1,s2,s3,s4,s5};
		
		Arrays.sort(s);
		
		for(Student n : s)
		{
			System.out.println(n);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s = (Student)o; //DownCasting
		
		if(this.age>s.age)return 1;  //increasing order
		else if(this.age<s.age)return -1;
		return 0;
		
		
//		return this.age-((Student)o).age; //Sort by age
//		return this.name.compareTo(((Student)o).name); //Sort by name
	}
	
	

}
