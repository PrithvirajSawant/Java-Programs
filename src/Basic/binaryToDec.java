package Basic;

public class binaryToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 110010;
		int rem = 0 , i=1; //2^0=1
		int dec = 0;
		int temp = num;
		while(num>0)
		{
			rem=num%10;
			num/=10;
			dec+=rem*i;
			i*=2;
		}
		System.out.println("Decimal equivalent of "+temp+" is "+dec);

	}

}
