import java.util.Arrays;
import java.util.Scanner;

// array is am object in java which contain similar type of data in a continuous memory location
public class array {

	public static void main(String[] args) {
		//int a[]= {10,20,30,40,50};
		//int a[]=new int [5];
		int a[][]=new int [3][3];
		System.out.println("enter arry value");
		Scanner s=new Scanner (System.in);
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<3;j++)
			{
			a[i][j]=s.nextInt();
		}
		//Arrays.sort(a);
		System.out.println("sorted narray element: \n");
		for(int i1=0;i1<3;i1++)
		{
			for (int j=0;j<5;j++)
			{
				System.out.println(a[i1][j]+ "");
			}
		}
//		for(int b : a)
//		{
//			System.out.println(b+" ");
//		}

	}

}
}
