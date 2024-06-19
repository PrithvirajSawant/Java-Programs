package Arrays;

public class TrueIfMuxOf3Or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		boolean a = mux(num);
		System.out.println(a);

	}
	
	static boolean mux(int n)
	{
		boolean flag = true;
		
//		if(n<0)
//		{
//			flag = false;
////			return false;
//		}
		if(n%3==0 && n%5==0)
		{
			flag = true;
//			return true; //we prefer flag over directly returning the statement as the program will terminate before checking the following statements.
		}
		
//		if(n<0 || n%3==0 && n%5==0)
		if(n<0)
		{
			flag = false;
//			return false;
		}
		
		if(flag)
			return true;
		else
			return false;
			
	}

}
