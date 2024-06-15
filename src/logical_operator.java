
public class logical_operator {

	public static void main(String[] args) {
		int a=10, b=20;
		//a+=10; //a=a+10; // this we use for conditional operator
		System.out.println(a==b && a!=b); // logical and operator in this both the condition are mandatory for true
		System.out.println(a==b || a!=b);// logical or operator in this any one condition needs to be true
		System.out.println(!(a>b));// logical not operator it working like opposite if condition is false the it shows true
		System.out.println(a!=b || a==b);
	}

}
