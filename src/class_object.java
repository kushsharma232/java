
public class class_object {
	
	int age=30;
	int weight=40;
	String colour="light";
	
	void eat ()
	{
		System.out.println("I am eating");
	}
	void sleeping ()
	{
		System.out.println("I am sleeping");
	}
	public static void main(String[] args) {
		class_object p=new class_object();
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.colour);
		
		p.eat(); p.sleeping();
		
	}

}
