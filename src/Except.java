// Exception handeling - Unexpected, unwanted and abnormal situation that occured called runtime called exception.
// Exception handeling - we should have an alternate source through which we can handel the exception.
//use case of exception- pre define excp >try ,>catch, user define excp - >throw, >throws, excp is exist or not exist - >finally

public class Except {
    public static void main(String[] args) {
        System.out.println("method starting");
        int a=10, b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
           // System.out.println(e);
           System.out.println("can't divide by zero");
        }
        System.out.println("main method ended");
    }
}
