package Strings;
import java.util.*;
public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "ArorA";
		String [] ss = {"a","b","a","b","c"};
		String s4 = Arrays.toString(ss);
//		System.out.print(s4);
//		int count = 0;
////		s=s.replace(" ", "");  // for Optimization
//		char arr[] = s.toCharArray();
//		//Creating Map for Key=Value pair
//		Map <Character , Integer> map = new TreeMap<>(); // Alternative method via Map
//		for(int i=0;i<=s.length()-1;i++)
//		{
//			count = 0;
//			for(int j=0;j<=s.length()-1;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;
//				}
//			}
//			//store
//			map.put(arr[i], count);
//		}
//		System.out.println(map);
		//---------------------------------------------------------------------------------------------------------------------
		while(s4!="") // The loop will continue until the loop gets empty
		{
			char ch = s4.charAt(0);
			String s2 = s4.replace(ch+"", ""); // to make it empty replace each char with empty string at every iteration
//			System.out.println(s2);
			int count = s4.length()-s2.length();
			s4=s2;
//			System.out.println(s);
//			System.out.print(ch); //To remove duplicate
			if(ch>='a' && ch<='z')
			{
				System.out.println(ch+" = "+count); //To print no. of Occurrence
			}
			
		}
		//---------------------------------------------------------------------------------------------------------------------
		//using for loop -- wrong*
//		String s = "aabbbccccc";
//		int count = 0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			String s2 = s.replace(ch+"", "");
//			count = s.length()-s2.length();
//			s=s2;
//			System.out.println(ch+"="+count);
//			
//		}
		//---------------------------------------------------------------------------------------------------------------------
//		HashMap<Character,Integer> map = new HashMap<>();
////		int count = 0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			if(map.containsKey(ch))
//			{
//				int count = map.get(ch); //If ch is already in the map, retrieve its current count using map.get(ch),
//				count++;				 //increment the count by 1,
//				map.replace(ch, count);  // and then update the value associated with the key ch using map.replace(ch, count).
//			}
//			else
//			{
//				map.put(ch, 1);
//			}
//		}
//		for(Character key:map.keySet())
//		{
//			System.out.print(key+""+map.get(key));
//		}
		
	}

}
        //---------------------------------------------------------------------------------------------------------------------
// Alternative 

//public class Charactertount {
//public static void main(String[] args) {
//
//String str = "Java";
//Map<Character, Integer> charMapCount = new HashMap<>();
//
//for(Character c : str.toCharArray()) {
//	if(charMapCount.containsKey{c)) {
//		charMapCount.put(c, charMapCount.get(c) + 1);
//
//		} else {
//		System.out.println(c, 1);
//}
//
//System.out.println(charMapCount);
//	}
