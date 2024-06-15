import java.util.Scanner;

public class condition_elseif {

	public static void main(String[] args) {
		int marks;
		System.out.println("Enter marks -");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if (marks>60 && marks<=100)
		{
			System.out.println("First division");
		}
		else if (marks>=45 && marks<=60)
		{
			System.out.println("Second division");
		}
		else if (marks>=33 && marks<=45)
		{
			System.out.println("Third division");
		}
		else 
		{
			System.out.println("Failed");
		}
	}

}
