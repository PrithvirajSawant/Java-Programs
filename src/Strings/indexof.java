package Strings;
//Removing Duplicates 
public class indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "ArorA";
		//replace method
//		String w = s.replace('A', 'E');
//		System.out.println(w);
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			char ch  = s.charAt(i);
			int x = s.indexOf(ch,i+1);
//			System.out.println(x);
			if(x==-1)
			{
				s2+=ch;
//				System.out.println(ch);
			}
//			int idx = s.indexOf(ch);
//			System.out.println(idx); //returns index of 1st occurrence of the ch.  
		}
		String s3 = "";
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3+=s2.charAt(i);
		}
		System.out.println(s3);
//		
		

	}

}
