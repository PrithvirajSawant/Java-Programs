package Strings;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		for(int i=0;i<sb.length()/2;i++)
		{
			int front = i;              //position
			int back = sb.length()-1-i; //position
			
			char frontChar = sb.charAt(front); //character
			char backChar = sb.charAt(back);   //character
			
			sb.setCharAt(front,backChar);  //Set first char to last char so on 
//			sb.setCharAt(back, frontChar); //Set last char to first char so on
			
		}
		System.out.println(sb);

	}

}
