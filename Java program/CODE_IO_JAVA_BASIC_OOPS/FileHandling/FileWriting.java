package CODE_IO_JAVA_BASIC_OOPS.FileHandling;
import java.io.FileWriter;
import java.io.File;

public class FileWriting {
    public static void main(String[] args) {
        try{
            File f= new File("Pavitra.txt");
            FileWriter w=new FileWriter(f);
            w.write("Become A Java Developer!!");
            w.write("\nJava Pragrammer\n");
            w.write('9');
            w.close();

        }
        catch(Exception E){
            System.out.println(E);

        }
        
    }
    
}
