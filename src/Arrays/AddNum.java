package Arrays;

public class AddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ja420va is16 oop7 lang22";
//		char ch[] = s.toCharArray();
		int rev = 0;
		int sum = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int rem = ch-48;
				rev=rev*10+rem;
			}
			else
			{
				if(rev!=0)  // not mandatory 
				{
					sum+=rev;
				}
				rev=0;
			}
			//if number at last part exist (i.e, for 22 else part won't execute so we need to write this condition explicitly)
			if(i==s.length()-1)
			{
				sum+=rev;
			}
		}
		System.out.println(sum);
//		System.out.println('a'-97); //ignore

	}

}
//To Do task:
//Anagram
//Panagram
//WAP to print max. occurrence of a character in a given string
//WAP to print min. occurrence word  in given string