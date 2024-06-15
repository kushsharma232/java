import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {
		float num;
		System.out.println("enter any number ");
		Scanner s=new Scanner(System.in);
		num=s.nextFloat();
		do
		{
			System.out.println(num+" "+num/3);
			++num;
		}
		while (num<=10);

	}

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

}
