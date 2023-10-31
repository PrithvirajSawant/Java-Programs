package ExceptionHandling;

public class tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 0;
		try
		{
			divide(a,b);
			System.out.println(divide(a,b));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally //Optional , Can be declared only once
		{
			System.out.println("This will always execute");
		}
		
	}
	
	static int divide(int a,int b) throws ArithmeticException
	{
//		if(b==0)
//		{
//			throw new ArithmeticException("Please do not divide by zero"); //To throw the exception Explicitly
//		}
		return a/b;

	}

}
