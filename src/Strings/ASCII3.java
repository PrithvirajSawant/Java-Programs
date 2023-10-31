package Strings;
// to UPPER case & lower case without using toUpperCase(); & toLowerCase();
public class ASCII3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prithviraj1234Sawant";
		String s2 = "";
//		char [] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
//				ch[i] = (char)(ch[i]+32);//(char)((int)(ch[i]+32));
				s2 =s2+ (char)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
//					ch[i] = (char)((ch[i]-32));
					s2 = s2+ (char)((int)(ch-32));
			}
//			System.out.print(ch[i]);
		}
		System.out.println(s2);

	}

}
