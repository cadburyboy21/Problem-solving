import java.util.*;
public class AdditionOf2Numbers {
    public static void main(String[] args){
        int Number1,Number2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number1");
        Number1= s.nextInt();
        System.out.println("Enter the Number2");
        Number2=s.nextInt();
        System.out.println("The Addition of Two numbers of"+Number1+" and "+Number2+" is "+(Number1+Number2));
    }
}

// output:

// Enter the Number1
// 15
// Enter the Number2
// 10
// The Addition of Two numbers of15 and 10 is 25