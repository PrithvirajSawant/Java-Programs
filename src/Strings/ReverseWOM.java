package Strings;
//--Reverse a string without using any inbuilt methods 
//--This is done by using pointers
public class ReverseWOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java is easy";
		int i = s1.length()-1;
		int j = s1.length()-1;
		String s2 = "";
		while(j>0)
		{
			while(j>=0&&s1.charAt(j)!=' ')
			{
				j--;
			}
			int k = j+1;
//			String temp = "";
			while(k<=i)
			{
				s2+=s1.charAt(k);
				k++;
			}
//			s2+=temp;
			if(j>0)
			{
				s2+=" ";
			}
			j--;
			i=j;
		}
//		System.out.println(j);
		System.out.print(s2);

	}

}
