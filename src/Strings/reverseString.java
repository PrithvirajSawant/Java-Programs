package Strings;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rajive jjk";
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
//			System.out.println(s1);
		}
		System.out.println(s.length());
		System.out.println(s1);

	}

}
