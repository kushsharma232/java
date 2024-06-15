import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		float num;
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		num=s.nextFloat();
		while (num>0)
		{
			if (num%2==0)
			{
				System.out.println("even number");
				break;
			}
			else 
			{
				System.out.println("odd number");
				break;
			}
		}
			System.out.println("no number");
		
	}

}
