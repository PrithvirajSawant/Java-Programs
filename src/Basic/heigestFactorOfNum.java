package Basic;

public class heigestFactorOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int stor = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				stor=i;
		}
		System.out.println(stor);

	}

}
