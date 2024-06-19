package Strings;

public class reverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to JSpiders";
		String[] s2 = s.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			for(int j=s2[i].length()-1;j>=0;j--)
			{
				System.out.print(s2[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
