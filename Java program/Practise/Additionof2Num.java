package Practise;
import java.util.Scanner;

public class Additionof2Num {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter numbers separated by spaces: ");

        int sum = 0;

        // While there is another integer in the input
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("Output: " + sum);
       

    }
}
