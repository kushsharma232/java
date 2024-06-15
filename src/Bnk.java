import java.util.Scanner;

// Abstraction - is nothing but hiding the essential information and highlighting the only set of services.
 
abstract class Bnk 
{
	public String Name="bank";
	public String IFSC="bank123";
	public void bankdetail() 
	{
		System.out.println("bank_name: "+Name+" "+"bank_IFSC CODE:  "+"IFSC");
		
	}
	abstract void Deposite();
	abstract void withdrawl();
	abstract void checkbalance();
}
 class Bankservice extends Bnk
{
	private double bal=5000;
	private int pwd;
	public double money;
	
	public void deposite() 
	{
		System.out.print("enter password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if (pwd==123)
		{
			System.out.println("enter deposite amount:");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("deposite money: "+money);
			System.out.println("Total balance: "+bal);
		}
		else 
		{
			System.out.println("Incorrect password");
		}
	}
	public void withdrawl() 
	{
		System.out.print("enter password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if (pwd==123)
		{
			System.out.println("enter withdrawl amount:");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("deposite money: "+money);
			System.out.println("Total balance: "+bal);
		}
		else 
		{
			System.out.println("Incorrect password");
	
	}
	}
	public void checkbalance() 
	{
		System.out.println("enter password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if (pwd==123)
		{
			System.out.println("total balance: "+bal);
		}
		else
		{
			System.out.println("Incorrect password");
		}
}
	@Override
	void Deposite() {
		// TODO Auto-generated method stub
		
	}
}
class Customers {
	public static void main(String []args) {
		Bankservice b=new Bankservice();
		b.bankdetail();
		int ch;	
		System.out.println("deposite");
		System.out.println("withdrawl");
		System.out.println("checkbalance");
		System.out.println("\nenter your choice");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		switch (ch)
		{
		case 1: b.deposite();
		break;
		case 2: b.withdrawl();
		break;
		case 3: b.checkbalance();
		break;
		default :System.out.println("Invalod choice.. ");
		}
	}
}
