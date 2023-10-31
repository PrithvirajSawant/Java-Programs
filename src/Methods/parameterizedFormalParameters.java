package Methods;

public class parameterizedFormalParameters {
//	Pgm - 1
//	public static void sayHello(String name) {
//		System.out.println("Hello, "+ name +"! This parameterized method of Formal Argument");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String userName = "John";
//		sayHello(userName);
//	}
//
	
	//Pgm - 2:
	public static int addNum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 2;
		int result = addNum(num1,num2);
		System.out.println(result);
	}          
}


