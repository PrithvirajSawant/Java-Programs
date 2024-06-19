package Strings;

import java.util.Arrays;

//Reverse without Split method;
public class ReverseWOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is oops lang";
		s = s.toLowerCase();
//		char ch[] = s.toCharArray();
		String s1 = "";
		String rev = "";
//		System.out.println('0'-48);
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s1=ch+s1;
//				s1+=" ";
//				System.out.println(s1);
	
			}
//			System.out.println(s1);
			else if (ch == ' ')
			{
                rev += s1+" ";
//                rev+=" ";
                s1 = "";
            }
			if(i==s.length()-1)
			{
				rev+=s1;
			}
		}
		System.out.println(rev);
		
	}

}
