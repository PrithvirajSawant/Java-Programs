package Basic;

public class heigestFactorOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
//		int stor = 0;
		for(int i=num/2;i>=1;i--) {
			if(num%i==0)
			{
				System.out.println(i);
				break;
			}
		}
//		System.out.println(stor);

	}

}
