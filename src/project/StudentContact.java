package project;

import java.util.HashMap;
import java.util.Scanner;

class Student
{
	String name;
	int id;
	String gender;
	int age;
	long cno;
	
	public Student(String name, int id, String gender, int age, long cno) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.cno = cno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", age=" + age + ", cno=" + cno + "]";
	}
	
	
	
	
}

class Jspiders
{
	HashMap<Long,Student> hm = new HashMap<Long,Student>();
	Scanner sc = new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter name of the student");
		String name =  sc.next();
		System.out.println("Enter id of the student");
		int id = sc.nextInt();
		System.out.println("Enter gender of the student");
		String gender = sc.next();
		System.out.println("Enter age of the student");
		int age = sc.nextInt();
		System.out.println("Enter cno of the student");
		long cno = sc.nextLong();
		hm.put(cno, new Student(name,id,gender,age,cno));
		System.out.println("Succfully added");
	}
	
	public void getDetails()
	{
		System.out.println("Enter cno of the student");
		long cno = sc.nextLong();
		if(hm.containsKey(cno))
		{
			System.out.println(hm.get(cno));
		}
		else
			System.out.println("Contact not found");
		
		
	}
	
	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Contact number");
		long cno  = sc.nextLong();
		if(hm.containsKey(cno))
		{
			hm.remove(cno);
			System.out.println("Contact successfully removed");
		}
		else
			System.out.println("Contact not found");
		
	}
	
	public void update()
	{
		System.out.println("Enter the contact to update");
		long cno = sc.nextLong();
		if(hm.containsKey(cno))
		{
			Student update = hm.get(cno);
			boolean flag = true;
			while(flag)
			{
				System.out.println("Change:\n1.Name\2.Id\n3.Age\n4.Gender\n5.exit");
				int k = sc.nextInt();
				
				switch(k)
				{
				case 1:
				{
					System.out.println("Enter new name");
					String newName = sc.next();
					update.setName(newName);
					
				}
				break;
				case 2:
				{
					System.out.println("Enter new Id");
					int newId = sc.nextInt();
					update.setId(newId);
				}
				break;
				case 3:
				{
					System.out.println("Enter new Age");
					int newAge = sc.nextInt();
					update.setAge(newAge);
				}
				break;
				case 4:
				{
					System.out.println("Enter new Gender");
					String newGender = sc.next();
					update.setGender(newGender);
				}
				break;
				case 5:
				{
					flag = false;
				}
				break;
				default: System.out.println("Invalid Operation");
				}
			}
			
		}
	}
	
}

public class StudentContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap hm = new HashMap();
//		hm.put(hm,new Student("raj",78,"Male",22,78900));
//		System.out.println(hm);
		Jspiders jsp = new Jspiders();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			
			System.out.println("1.Add\n2.Display\n3.Remove\n4.Update\n5.exit");
			System.out.println("-----------------------------");
			int key = sc.nextInt();
			switch (key) 
			{
			case 1: 
			{
				Scanner s = new Scanner(System.in);
				System.out.println("How many contacts you want to enter");
				int n = s.nextInt();
				for(int i =1;i<=n;i++)
				{
					jsp.add();
				}				
			}
			break;
			case 2:
			{
				jsp.getDetails();;
			}
			break;
			case 3:
			{
				jsp.remove();
			}
			break;
			case 4:
			{
				jsp.update();
			}
			break;
			case 5:
			{
				flag = false;
				
			}
			break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
			
		}

	}

}

//Map
//Map is an interface available in java.util package.
//We store data in map in the form Key & value pair.
//Where key cannot be duplicate but value can be duplicate.
//In map duplicate keys are not allowed.
//Only one null value we can use as a key, But value can be n no. of null values.
//Maps helps us to access the values easily with the help of keys.
//Map has 4 concrete implementing classes : HashMap, LinkedHashMap, TreeMap, HashTable.

//HashMap
//HashMap is a concrete implementing class for map interface.
//Even in HashMap our data is stored in the form of key & value pair.
//In HashMap order of insertion is not preserved/maintained.
//Key cannot be duplicate but value can be duplicate.
//In hash only one null value we can use as a key.
//But values can be n no. of null values.

//LinkedHashMap
//LinkedHashMap is a concrete implementing class for map interface.
//In LinkedHashMap we will store our data in the form of key & value pair.
//In LinkedHashMap follows insertion order.
//In LinkedHashMap duplicate elements are not allowed.
//Key must be unique and value can be duplicate.
//Only one null values is allowed

//TreeMap
//It is concrete implementing class for map interface.
//TreeMap stores data in the form of key and value pair.
//In TreeMap all the entries are going to store in ascending order.
//The keys should be in homogeneous type(i.e, Comparable type) , else we will get classCastException.
//null inception is not possible.
//If we try to use null values we will get nullPointerException.	

//HashTable
//It is a legacy class. (i.e, it is available from V.1.0)


