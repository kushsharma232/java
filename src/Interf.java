// Inheritance - when one class access the property of another class is called inheritance
//Note - In java extends class is used to perform inheritance, and provide code reusability
//note- we can't access private class member through inheritance
//note- A sub class contain all the feature of super class so we should create the object of sub class
// note - Method overriding only possibile through inheritance
//simple inheritance - which contain only one super class and one sub class

/*class Student  // super class
{
	int rollno,marks;
	String name;
	void input()
	{
		System.out.println("enter  your roll number & marks");
		
	}
}
class Ankit extends Student // sub class
	{
	void result()
	{
		rollno=1; marks=10; name="ankit";
		System.out.println(rollno+" "+marks+" "+name);
	}
	public static void main(String[] args) {
		Ankit a=new Ankit();
		a.input(); a.result();
	}

}*/

// Multiple inheritance - which contain only one super class and multiple sub class

/*class Student
{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println("sun of two number"+c);
	}
	void sub()
	{
		a=200;
		b=300;
		c=a-b;
		System.out.println("sub od two number"+c);
	}

	
}
public class B extends Student
	{
		void mult()
		{
			a=1;
			b=10;
			c=a*b;
			System.out.println("multilpe of two num"+c);
		}
		void div()
		{
			a=9;
			b=3;
			c=a/b;
			System.out.println("div the sum of num"+c);
		}
}
class C extends B{
	void rem()
	{
		a=10; 
		b=3;
		c=a%b;
		System.out.println("rem of num"+c);
	}
}
class Test {
	public static void main(String[] args) {
		C r=new C();
		r.add(); r.sub(); r.rem(); r.div(); r.mult();
	}
}*/

// Multiple inheritance using interface :- interface contain only abstract method wgich implemenataion is provided by subclasses

interface A{
	void show(); // public + abstract
}
interface C{
	//void show(); // public + abstract
	void other();
}
 class Interf implements A,C {
	public void show() {
		System.out.println("Interface A&B");
	}
	public void other() {
		System.out.println("Interface B");
	}
	public static void main(String[] args) {
		Interf m=new Interf();
		m.show(); m.other();
	}
}