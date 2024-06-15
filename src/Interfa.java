//Interface - just like a class which contain abstract method.to achieve interface method by the help of implements/ interface keyword
// Note -  by default variable are public, static, final inside a interface
// By default method are public and abstract

interface vehcile
{
	String name="honda";
	int speed=100;
	void start();
	void stop();
	default void color() {
		System.out.println("black color bike");
	}
	static void engine() {
		System.out.println("150 cc engine");
	}
	
	}
class Interfa implements vehcile {
	@Override
	public void start() {
		System.out.println("start: insert ket and press start button");	
	}
	@Override
	public void stop() {
		System.out.println("stop: exit key");	
	}
	public static void main(String []args) {
		Interfa i=new Interfa();
		i.start(); i.stop(); i.color();
		vehcile.engine();
		System.out.println(speed);
	}
}
