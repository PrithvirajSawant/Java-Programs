package Strings;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Voavelaa";
		int count = 0;
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			char ch = s.charAt(i);
//			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') // consonants
//			{
//				count++;
////				String s2 = s.replace(ch+"", "");    //Occurrence 
////				int count2 = s.length()-s2.length();
////				System.out.println(ch+"="+count2);
////				s=s2;
//			}
//		}
		
		char [] vowels = {'a','e','i','o','u'}; //Optimized for Vowel 
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			for(int j=0;j<vowels.length;j++)  //for(char v : vowels)
				{
				char v = vowels[j];       //comment out this line while using enhanced for loop. 
				if(ch==v)
					{
//						count++;
//						break;
					String s2 = s.replace(ch+"", "");    //Occurrence 
					int count2 = s.length()-s2.length();
					System.out.println(ch+"="+count2);
					s=s2;
//					System.out.println(ch);
					}
				}
		}
//		System.out.println(count); //number of vowels
		

	}

}
