import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter any two anumber :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("your choice number");
		c=s.nextInt();
		switch(c)
		{
		case 1:d=a+b;
		System.out.println("addition "+d);
		break;
		case 2:d=a-b;
		System.out.println("Substraction" +d);
		case 3:d=a/b;
		System.out.println("Division" +d);
		case 4:d=a*b;
		System.out.println("multiplication" +c);
		case 5:d=a%b;
		System.out.println("reminder" +c);
		default:
			System.out.println("no choice....");
		}

	}

}
