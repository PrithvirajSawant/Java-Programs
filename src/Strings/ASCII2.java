package Strings;

public class ASCII2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prithviraj1234Sawant";
//		int sum = 0;
		String s2 = "";
		String s3 = "";
		String s4 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s2+=ch;
			}
			else if(ch>='A' && ch<='Z')
			{
				s3+=ch;
			}
			else
			{
				s4+=ch;
			}
		}
		System.out.println("To LowerCase : "+s2);
		System.out.println("To UperCase : "+s3);
		System.out.println("To Integers : "+s4);
		

	}

}
