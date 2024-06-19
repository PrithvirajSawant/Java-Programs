package ExceptionHandling;

public class explicitExceptions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			try
			{
				String name = "Raj";
				if(name.equals("Raj"))
				{
					throw new MyException("Name is Raj Exception");
				}
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}
			
			

	}
	

}
