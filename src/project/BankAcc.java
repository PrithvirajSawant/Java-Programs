package project;

import java.util.ArrayList;
import java.util.Scanner;

class Account
{
	private String accHolder;
	private long accNo;
	private long ifsc;
	private String branch;
	
	public Account(String accHolder, long accNo, long ifsc, String branch) {
//		super();
		this.accHolder = accHolder;
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public long getIfsc() {
		return ifsc;
	}

	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", accNo=" + accNo + ", ifsc=" + ifsc + ", branch=" + branch + "]";
	}
	
	

}
class Bank
{
	ArrayList<Account> a = new ArrayList<>();
	
	public void addAcc()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder name");
		String accHolder = sc.next();
		System.out.println("Enter the Account number name");
		long accNo = sc.nextLong();
		System.out.println("Enter the IFSC number name");
		long ifsc = sc.nextLong();
		System.out.println("Enter the Branch name name");
		String branch = sc.next();
		
		Account acc = new Account(accHolder,accNo,ifsc,branch);
		
		a.add(acc);
		
	}
	
	public void Display()
	{
		System.out.println("List of Account & details");
		for(Account ac : a)
		{
			System.out.println(ac.toString());
		}
		if(a.size()==0)
		{
			System.out.println("No Accounts to retrive");
		}
	}
	
	public void remove()
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder name");
		String name = sc.next();
		for(int i=0;i<a.size();i++)
		{
			if(name.equals(a.get(i).getAccHolder()))
			{
				count++;
				a.remove(i);
				System.out.println("Account removed Successfully");
			}
		}
		if(count==0) {
			System.out.println("Account not found");
		}
	}
	
	public void contains()
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder name");
		String name = sc.next();
		for(int i=0;i<a.size();i++)
		{
			if(name.equals(a.get(i).getAccHolder()))
			{
				count++;
				System.out.println(name+" has an Account in the Bank");
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Account not found");
		}
	}
}
public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b  = new Bank();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("1.Add Account\n2.Display\n3.Remove Account\n4.Contains\n5.exit");
			int key = sc.nextInt();
			switch(key)
			{
			case 1:
			{
				System.out.println("Enter no. of Accounts to enter");
				int n = sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					b.addAcc();
				}
			}
			break;
			case 2:
			{
				b.Display();
			}
			break;
			case 3:
			{
				b.remove();
			}
			break;
			case 4:
			{
				b.contains();
			}
			break;
			case 5:
			{
//				flag=false;
				flag = false;
			}
			break;
			default:
			{
				System.out.println("Invalid Choice. Try again");
			}
			}
		}

	}

}
