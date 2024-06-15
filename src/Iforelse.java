import java.util.Scanner;

public class Iforelse {

	public static void main(String[] args) {
		
		int pwd;
		System.out.println("Enter passwprd=");
		Scanner s=new Scanner (System.in);
		pwd=s.nextInt();
		if(pwd==1234)
		{
			System.out.println("Name= shivam");
			System.out.println("Age= 31");
		}
		
		else
		{
			System.out.println("Wrong password");
		}

	}

}
