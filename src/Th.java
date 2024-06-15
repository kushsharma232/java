//This key word - This key word refer to current object inside a method or constructor 
/*class Th 
{
	int a;  //Instance variable
	Th(int a) // local variable
	{
		this.a=a; // when local variable are confuse to call instance variable then we use this keyword
	}
	void show()
	{
		System.out.println(a);
		//System.out.println(this);// know our unique reference number
	}
 
	public static void main(String[] args) {
		Th r=new Th(100);
		//System.out.println(r);
		r.show(); // check for print 2 time

	}

}*/

//when we call default constructor in own class in this keyword

/*class Th 
{  
	Th() 
	{
		 System.out.println("hello");
	}
	Th(int a)
	{
		this();
		System.out.println(a);
	}
 
	public static void main(String[] args) {
		Th r=new Th(100);

	}

}*/

//It also called parameterized constructor of its own class

class Th 
{  
	Th() 
	{
		 this(10);
	}
	Th(int a)
	{
		System.out.println(a);
	}
 
	public static void main(String[] args) {
		Th r=new Th();

	}

}
