package Regex;
//Invoke character
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Invoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String exp = "."; // matches every character in a given string.
//		String exp = ".."; //this exp is going to match 2 chars in given String.
//		String exp = "a.b"; //Matches/ takes 3 characters as input to match i.e, 1st char is a ; 2nd char is .(.=> any char); 3rd char is b in the given String.
//		String exp = "\\."; //(or)"[.]"
		String exp = "a[.]b"; // matches exactly a.b
		String s = "ab.ab.a.bbbad";
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
