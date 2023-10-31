package Strings;

public class MinOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "java is a oop lang";
		String s = "ArorA";
		int count = 0;
//		int count2 = 0;
		int min = 9;
		char c = ' ';
		while(s!="")
		{
			char ch = s.charAt(0);
			String s2 = s.replace(ch+"", "");
			count = s.length()-s2.length();
			s=s2;
//			System.out.println(ch+"="+count); //all occurrence
			if(min>=count)
			{
//				count2++;
				min=count;
				c=ch;
//				System.out.println(count2+": "+c+" = "+min+" occurrence");
			}

		}
		System.out.println(c+" = "+min+" occurrence");

	}

}
