package Strings;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The Quick Brown Fox Jumps Over a Lazy Dog";

		s = s.replace(" ", "");
		s = s.toUpperCase();
		char ch[] = s.toCharArray();
		Arrays.sort(ch); //optional
		int size = ch.length;
//		System.out.println(size);
//		System.out.println(s);
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//		int size = a.length;
//		System.out.println(size);
		
		//Part-1
		int i = 0;
		while(i!=size)
		{
			int index = ch[i]-65;
			a[index] = 1;
			i++;
		}

		//Part-2
		i = 0;
		while(i!=a.length)
		{
			if(a[i]==1)
			{
				i++;
			}
			else
			{
				System.out.println("Not a Pangram");
//				System.exit(0);
				return;
			}
		}
		System.out.println("Pangram");
	}

}
