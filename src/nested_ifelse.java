
public class nested_ifelse {

	public static void main(String[] args) {
		int num1=10, num2=20, num3=30;
		if (num1<num2)
		{
			if (num1<num3)
			{
				System.out.println("max numer" + num1);
			}
			else 
			{
				System.out.println("max numr" + num3);
			}
		}
		else 
		{
			if(num2>num3)
			{
				System.out.println("max number" + num1);
			}
			else
			{
				System.out.println("max number" + num1);
			}
		}
}


	}

