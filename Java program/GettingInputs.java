import java.util.*;
public class GettingInputs {
    public static void main (String[] args){
        String Name;
        int Age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the student name:");
        Name =s.nextLine();
        System.out.println("Student Age");
        Age =s.nextInt();
        System.out.println("Student Name:"+Name);
        System.out.println("Student Age:"+Age);
    }
}
