package conditionalStatements;

import java.util.Scanner;

public class projectATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner sc = new Scanner(System.in); 
			System.out.println("Welcome to ATM");
			System.out.println("1.Check Balance \n2.Withdraw \n3.Deposit \n4.Pin Change");
			System.out.println("Enter the Pin");
			int choice = sc.nextInt();
			int totalamount = 3000;
			int pin = 123;
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the Pin");
				int enteredPin = sc.nextInt();
				if(enteredPin == pin)
				{
					System.out.println("The available balance is = "+totalamount);
				}
				else
				{
					System.out.println("Incorrect Pin");
				}
			}
			break;
			case 2:
			{
				System.out.println("Enter the Pin");
				int enteredPin = sc.nextInt();
				System.out.println("Enter the amount to withdraw");
				int amount  = sc.nextInt();
				if(enteredPin == pin)
				{
					if(amount<totalamount)
					{
						totalamount-=amount;
						System.out.println("Transaction Successfull \nThankyou \nThe available balance is "+totalamount);
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
				}
			}
			}
		}

	}

}
