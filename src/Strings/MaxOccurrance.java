package Strings;
//Occurrence 5
public class MaxOccurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Happy Vinayaka Chathurti";
		s = s.toLowerCase();
		int max=0;
		char c = ' ';
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char ch0 = s.charAt(i);
			for(int j=i+1;j<s.length();j++)
			{
				char ch = s.charAt(j);
				if(ch0==ch)
				{
					count++;
					ch=' ';
				}
				if(count>max&&ch0!=' ')
				{
					max=count;
					c=ch0;
				}
			}
		}
		System.out.println(c+"="+max);
	}

}
