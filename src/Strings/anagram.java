package Strings;

import java.util.Arrays;
import java.util.Collections;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = {2,8,5,6,1};
//		int b[] = {5,6,1,2,8};
//		
//		Arrays.sort(a);
//		Arrays.sort(b);
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]);
//		}
		
//		Arrays.asList(a);
//		Arrays.asList(b);
		
		
		String s1 = "Race in pos";
		String s2 = "Care nisop";
		
		s1 = s1.replace(" " , ""); 
		s2 = s2.replace(" " , "");  
		
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
