package Strings;

import java.util.HashMap;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rArorA";
		
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<s.length();i++)
//		{
//			char ch = s.charAt(i);
//			int idx = s.indexOf(ch,i+1);
////			System.out.println(idx);
//			if(idx==-1) {
//				sb.append(ch);
//			}
//		}
//		System.out.println(sb);
		
		
		
//		A->2
		
		HashMap<Character,String> map = new HashMap<>();
//		HashMap<Character,String> map = new HashMap<>(); //This also correct
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
//				int count = map.get(ch); // to replace it with the no. of occurrence, to make this work replace the String constraint in the map to Integer.
//				count++;
				map.replace(ch, ""); // To eliminate the duplicates./ Not necessary as the key is unique 
				
			}
			else
			{
				map.put(ch,""); // we are adding first occurrence of the char to the map.
//				map.put(ch,1);
			}
			
		}
		for(Character key:map.keySet())
		{
			System.out.print(key);
//			System.out.print(key+""+map.get(key));
		}

	}

}
