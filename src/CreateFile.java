//File handeling - We can read and write data on a file java IO package contain all the classes through which we can perform all the input and output operation in the file
// file handeling is also known as stream 
// use IO exception when we upload, create, write in a file
import java.io.*;

import javax.xml.stream.util.StreamReaderDelegate;

/*public class CreateFile {
    public static void main(String[] args) throws Exception {
        //try {
            File f=new File("C:\\Users\\Shivam.Sharma\\Downloads\\test.text");
            if (f.createNewFile()) {
                System.out.println("File successfully update");
            }
       // } catch (Exception i) {
       //     System.out.println(i);
        }
        
    }*/
// File writer
/*public class CreateFile {
    public static void main(String[] args) throws Exception {
        FileWriter f = null;
        try {
            String FilePath = "C:\\Users\\Shivam.Sharma\\Downloads\\filewriter.text";
            f=new FileWriter("C:\\Users\\Shivam.Sharma\\Downloads\\filewriter.text");
                f.write("data enter in ther file");
            System.out.println("data written successfully");
        }
          catch (Exception i) {
            System.out.println("error writing in file :" + i.getMessage());
        }
        try {
            if (f !=null);
            f.close();
        } catch (Exception i ) {
            // TODO: handle exception
            System.out.println("error writing in file :" + i.getMessage());
        }
        
    }
}*/

// File reader
public class CreateFile {
    public static void main(String[] args) {
        FileInputStream f=null;
        FileReader r = null;
        try {
            String filepath = ("C:\\Users\\Shivam.Sharma\\Downloads\\filewriter.text");
            f=new FileInputStream("C:\\Users\\Shivam.Sharma\\Downloads\\filewriter.text");
            r=new FileReader("C:\\Users\\Shivam.Sharma\\Downloads\\filewriter.text");
            int character;
            //String reader;
            while ((character=r.read()) !=-1) {
                System.out.print((char)character);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            try {if (r !=null) {
                r.close();
                System.err.println("file close");
            }
        }catch (IOException i){
            System.err.println(i.getMessage());
        }


        }
    }
}