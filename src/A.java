import java.sql.Ref;
// default constructor- A constructor which does not have any default parameter is called default constructor 
//Constructor is a block of codes similar to the method. It is called when an instance of the class is created.
/*class A 
{
	int a; String b; Boolean c;
	A () // default constructor
	{
		a=10; b="shivam"; c=true;
	}
	void object()
	{
		System.out.println(a+" "+b+" "+c);
}
 static class B
	{
		public static void main(String[] args) {
			A q=new A();
			q.object();
		}
	}
	
}*/

// Parameterized constructor -  The constructor which we have pass one or more parameters is called parameterized constructor.
/*class A
{
	int x,y;
	A(int a,int b) //Parameterized constructor
	{
		x=a; y=b;
	}
	A(int a,String c)
	{
		System.out.println(a+" "+c);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
	
}
class B
{
	public static void main(String[] args) {
		A r=new A(100,200);
		r.show();
		A ref=new A(10,"shivam");
		
	}
	
}*/

//copy constructor - whenever we pass object reference to the constructor than it is called copy constructor
/*class A
{
	int x; String y;
	A()
	{
		x= 10; y= "shivam";
		System.out.println(x+" "+y);
	}
	A(A ref)
	{
		x=ref.x;
		y=ref.y;
		System.out.println(x+" "+y);
	}
	A(int a,String c)
	{
		x=a;
		y=c;
		System.out.println(x+" "+y);
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
	
}
class B
{
	public static void main(String[] args) {
		A r=new A(10,"shivam");
		r.show();
		//copy constructor line
		A ref=new A(r);
		ref.show();
	}
	
}*/

// Private constructor - It is possibile to write a constructor as private but according to the rule we can't access private member outside of the class

/*class A
{
	int a; double b; String c;
	private A()
	{
		a=10; b=11.11; c="shivam";
		System.out.println(a+" "+b+" "+c);
	}
	static void show()
	{
		
	}
	public static void main(String[] args) {
		A r=new A();
	}
	
}*/
