package ConditionalStatement;
import java.util.*;

public class FindTheLargestNo {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();

    if(a>b && a>c){
        System.out.println("A is Largest Number");
    }
    else if(b>a && b>c){
        System.out.println("B is largest Number");
    }
    else {
        System.out.println("C is Largest Number");
    }


    // Another type

    // int max = Math.max(c,Math.max(a,b));
    // System.out.println(max);
    
    }
}
