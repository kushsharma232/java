import java.util.Scanner;

// Encapsulation is a machine through which we can banding the data member and member method in single unit
public class Bank 
{
	private double bal=5000;
	private int password;
	
	public void deposite(double money)
	{
		System.out.println("enter password");
		 Scanner r=new Scanner(System.in);
		 password=r.nextInt();
		 if (password==123)
		 {
			 bal=bal+money;
			 System.out.println("deposite: "+ money);
			 System.out.println("total balance: "+ bal);
		 }
		 else
		 {
			 System.out.println("incorrect password.");
		 }
	}
	public void withdrawl(double money)
	{
		System.out.println("enter password");
		Scanner w=new Scanner(System.in);
		password=w.nextInt();
		if (password==123)
		{
			bal=bal-money;
			System.out.println("withdrawl money: "+ money);
			System.out.println("toatl balance: "+bal);
		}
		else
		{
			System.out.println("incoreect password");
		}
		
	}
	public void checkbal()
	{
		System.out.println("enter password");
		Scanner s=new Scanner(System.in);
		password=s.nextInt();
		if (password==123)
		{
			System.out.println("enter password: "+bal);
			
		}
		else
		{
			System.out.println("incorrect password");
		}
	}

}
class Customer {
	public static void main(String []args) {
		Bank b=new Bank();
		int ch;
		System.out.println("deposite");
		System.out.println("withdrawl");
		System.out.println("checkbalance");
		System.out.println("\nenter your choice");
		Scanner s1=new Scanner(System.in);
		ch=s1.nextInt();
		switch (ch)
		{
		case 1: b.deposite(1000);
		break;
		case 2: b.withdrawl(2000);
		break;
		case 3: b.checkbal();
		break;
		default: System.out.println("invalid choice..");
		}
	}
}