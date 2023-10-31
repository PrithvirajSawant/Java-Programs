package Strings;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public A modify(int i)
	{
		if(this.i!=i)
		{
			return new A(i);
		}
		return this;
	}
}
public class immutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A(10); //Direct Heap // The string literal "10" is stored in the SCP when the new A(10) statement is executed.
//		A a5 = new A(30);
		A a2 = a1.modify(20); // SCP // The string literal "20" is also stored in the SCP when the a2 = a1.modify(20) statement is executed.
		A a4 = a2.modify(20); 
		
		A a3 = a1.modify(10);
		
		A a6 = a1.modify(30);
		A a7 = a1.modify(30);
//		A a8 = a1.modify(30);
		
		System.out.println(a1);
//		System.out.println(a5);
		System.out.println(a2);
		System.out.println(a4);
		System.out.println(a3);
		System.out.println(a6);
		System.out.println(a7);
//		System.out.println(a8);
		System.out.println(a1==a3);
		System.out.println(a2==a4);
		System.out.println(a6==a7);

	}

}

// A1: This object is created when the new A(10) statement is executed. It is assigned the value 10.
// A2: This object is created when the a2 = a1.modify(20) statement is executed. The modify() method checks if the value of the i variable in the current object is equal to 20. Since it is not, the method creates a new object with the value 20 and returns a reference to that object.
// A3: This object is created when the a3 = a1.modify(10) statement is executed. The modify() method checks if the value of the i variable in the current object is equal to 10. Since it is, the method does not create a new object and simply returns a reference to the current object.
