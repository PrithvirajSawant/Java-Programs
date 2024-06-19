package Strings;  //***** ignore
//import java.lang.reflect.Array;
import java.util.*;
public class sort {
	static String s = "Array";
	String s2 = "rraay";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort so = new sort();
		Sortt1();
		so.Sortt2();
//		if(so.Sortt1()==so.Sortt2())
//		{
//			
//		}

	}
	public static void Sortt1()
	{
		char ch[] = s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' )
			{
				ch[i]+=(char)32;
			}
			// Convert the character array back to a string
//	        String sh = String.valueOf(ch);

//			if(ch[i]>='a' && ch[i]<='z') 
//			{
//				ch[i]-=(char)32;
//			}
//			System.out.println(ch[i]);
//			Arrays.sort(ch);
			for(int j=0;j<ch.length-1;j++)
			{
				for(int k=0;k<ch.length-i-1;k++)
				{
					if(ch[k]>ch[k+1])
					{
						char temp = ch[k];
						ch[k] = ch[k+1];
						ch[k+1] = temp;
					}
				}
			}
		}
		for(int h=0;h<ch.length;h++)
		{
			System.out.print(ch[h]+" ");
		}
		System.out.println();
	}
	
	public void Sortt2()
	{
		char ch[] = s2.toCharArray();
		for(int i=0;i<=s2.length()-1;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' )
			{
				ch[i]+=(char)32;
			}
//			if(ch[i]>='a' && ch[i]<='z') 
//			{
//				ch[i]-=(char)32;
//			}
//			System.out.println(ch[i]);
//			Arrays.sort(ch);
			for(int j=0;j<ch.length-1;j++)
			{
				for(int k=0;k<ch.length-i-1;k++)
				{
					if(ch[k]>ch[k+1])
					{
						char temp = ch[k];
						ch[k] = ch[k+1];
						ch[k+1] = temp;
					}
				}
			}
		}
		for(int h=0;h<ch.length;h++)
		{
			System.out.print(ch[h]+" ");
		}
	}

}
