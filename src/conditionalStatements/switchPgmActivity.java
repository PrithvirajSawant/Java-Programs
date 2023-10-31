package conditionalStatements;

public class switchPgmActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int activity = 9;
		switch(activity)
		{
		case 1:
		case 6:
		{
			System.out.println("Art");
		}
		break;
		case 2:
		case 3:
		{
			System.out.println("Dance");
		}
		break;
		case 4:
		case 7:
		case 8:
		{
			System.out.println("Sing");
		}
		break;
		default:
		{
			System.out.println("-_-");
		}
		
		}

	}

}
