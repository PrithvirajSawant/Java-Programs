package Strings;
import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Race in pos";
		String s2 = "Care nisop";
		
		s1 = s1.replace(" " , "");  //optional to optimize
		s2 = s2.replace(" " , "");  //optional to optimize
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result = Arrays.equals(ch1,ch2);
		
		if(result)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}

	}

}
