package Strings;

public class maxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abaacbacbcc";
		int count = 0;
		int max = 0;
		char c = ' ';
		while(s!="")
		{
			char ch = s.charAt(0);
			String s2 = s.replace(ch+"","");
			count = s.length()-s2.length();
			if(max<count)
			{
				max = count;
				c = ch;
			}
			s = s2;
		}
		System.out.println(c + " = " + max);
	}

}
//Occurrence