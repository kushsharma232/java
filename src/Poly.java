    //polymorphsim- Same object having different bheviour or say as multiple method/form
// Compile time polymorphsim - Which exist at the time of compilation is called compile time or early biding or static polynorphism
// Example methodoverloading - contain more than one method with same name and different type of parameters called method overloading
/*public class Poly {
    //void add()
    int add()
     {
        int a=10,b=20,c;
        c=a+b;
       // System.out.println(c);
        return c;
    }
    void add (int x,int y)
    {
            int c;
            c= x+y;
            System.out.println(c);
    }
    void add (int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Poly r=new Poly();
        //r.add(); r.add(100,200); r.add(50, 10.10);
        int add=r.add(); r.add(100,200); r.add(50, 10.10);
        System.out.println(add);
    }
}*/

// Runtime polymorphism - Which exist at time of execution of programe 
// method overriding

class Shape{
    void draw()
    {
        System.out.println("can't change shape");
    }   
}
@override
class Square extends Shape{
    void draw()
    {
        super.draw();
        System.out.println("square shape");
    }   
}
class Poly{
    public static void main(String[] args) {
        Square r=new Square();
        r.draw();
    }
}
