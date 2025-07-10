package Practise;
import java.util.*;
public class SideProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // 3

        int x=0, y=0;
        for(int i=10;i<=n*10;i+=10)
        {
            if(i%40==0){
                System.out.print("  1");
                y=y-i;
            }
            if(i%30==0){
                System.out.print(" 2");
                x=x-i;
            }
            if(i%20==0){
                System.out.print(" 3");
                y=y+i;
            }
            else{
                 System.out.print("\t"+x);

                x=x+i*2;
                 System.out.print("\t"+x+"\n");
            }
        }
        System.out.println(x+" "+y );
        scanner.close();
    }
}
