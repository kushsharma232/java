import java.util.Scanner;

public class scanners {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter any two number");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		
		c=a+b;
		System.out.println("sum of two numbers= "+c);

	}

}
