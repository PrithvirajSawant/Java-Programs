package Strings;

public class reverseWoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rajive";
		String s1 = "";
		char [] ch = s.toCharArray();
		int count = 0 ;
		for(int i=ch.length-1;i>=0;i--)
		{
			count++; // now we can count without using length() method
 			s1+=ch[i];
		}
//		System.out.println(ch.length); // we can do it without using count also 
		System.out.println(s1);
		System.out.println(count+" Characters");
	}

}
