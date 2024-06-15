// super is a keyword that is used to refer to the immediate parent class of the current class.
class Supper
{
	int Supper =10;
//	void show()
//	{
//		System.out.println("hello");
//	}

static class B extends Supper
{
	
	int supper =20;
	@Override
	public void show()
	{
		//super.show();
		System.out.println("Supper");
		System.out.println(super.Supper);
	}
}
static class test
{
	public static void main(String[] args) {
		Supper r=new Supper();
		r.show();
		B b=new B();
		b.show();

	}
	
}
public void show() {
	// TODO Auto-generated method stub
	
}
}
