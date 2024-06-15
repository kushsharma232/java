// Abstraction - is nothing but hiding the essential information and highlighting the only set of services.
abstract class Animal 
{
	void leg() 
	{
		System.out.println("animal has 4 leg");
	}
	abstract void sound();
	abstract void eat();
}
class dog extends Animal
{

	@Override
	void sound() {
		System.out.println("bow bow..");
	}
	void eat() {
		System.out.println("anything eating");
	}
}
class cow extends Animal
{

	@Override
	void sound() {
		System.out.println("ooo ooo..");
	}

	void eat() {
		System.out.println("eating grass");
	}
}
class abClass
{
	public static void main(String []args) {
	dog d=new dog();
	cow c=new cow();
	d.sound(); d.eat(); d.leg();
	c.sound(); d.eat(); c.leg();
}
}