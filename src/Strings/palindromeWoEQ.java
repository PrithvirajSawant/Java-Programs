package Strings;
//EQ = equals()
public class palindromeWoEQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ArorA";
		if(isPalindrome(s)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true; 
	}

}
