// Inheritance - when one class access the property of another class is called inheritance
//Note - In java extends class is used to perform inheritance, and provide code reusability
//note- we can't access private class member through inheritance
//note- A sub class contain all the feature of super class so we should create the object of sub class
// note - Method overriding only possibile through inheritance
//simple inheritance - which contain only one super class and one sub class
//multiple inheritance- whicn contain only one super class and multiple sub class

class A{
    void input()
    {
        System.out.println("What is your name");
    }

    public void add(int i, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void add(int i, double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public void add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
class B extends A{
    void show()
    {
        System.out.println("My name is shivam");
    }
}
class C extends A{
    void disp()
    {
        System.out.println("My name is shubham");
    }
}
class Inherit{
    public static void main(String[] args) {
        B r=new B();
        C r1=new C();
        r.input(); r.show();
        r1.input(); r1.disp();
    }
}