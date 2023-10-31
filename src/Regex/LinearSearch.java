package Regex;
//String linear search
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String exp = "a";
		String exp = "."; // matches every character in a given string 
		String s = "abababbbad";
		int count = 0;
		
		Pattern p=Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		//find() method
//		while(m.find())count++;
//		
//		System.out.println(count);
		
		//start() , end(), group() methods
		while(m.find())
		{
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("---------");
		}

	}

}
