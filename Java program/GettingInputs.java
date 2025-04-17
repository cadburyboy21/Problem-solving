import java.util.*;
public class GettingInputs {
    public static void main (String[] args){
        String Name;
        int Age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the student name:");
        Name =s.nextLine();
        System.out.println(" Enter Student Age:");
        Age =s.nextInt();
        System.out.println("Student Name:"+Name);
        System.out.println("Student Age:"+Age);
    }
}

// Output

// Enter the student name:
// Poovarasan
// Enter the Student Age:
// 20
// Student Name:Poovarasan
// Student Age:20
