package Arrays;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banana";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='1';
				}
				
			}
//			System.out.print(ch);
//			System.out.println();
			if(ch[i]!='1')
				System.out.println(ch[i]+" "+count);
		}
//		System.out.print(ch); //to remove the duplicates 
		

	}

}
