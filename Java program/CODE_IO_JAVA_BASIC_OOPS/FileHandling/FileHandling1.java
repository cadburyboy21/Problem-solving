package CODE_IO_JAVA_BASIC_OOPS.FileHandling;
import java.util.Scanner;
import java.io.File;

public class FileHandling1 {
   public static void main(String[] args) {
    try{
        File A=new File("Example.txt");
        Scanner reader=new Scanner(A);
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());

        }

    }
    catch(Exception E){
        System.out.println(E);
    }

   } 
}
