package Basic;

//import java.util.Scanner;

public class decToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 50;
		 int temp = num;
		 long b = 0;
		 int rem=0,i=1;
		 while(num>0)
		 {
			 rem=num%2;
			 num/=2;
			 b+=rem*i;
			 i*=10;
		 }
//		 System.out.println(i);
		 System.out.println("Binary equivalent of "+temp+" is "+b);

	}

}
