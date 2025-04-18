package ConditionalStatement;

import java.util.Scanner;

// Divisible by 3 and 5
// Write a program that checks if a given number is divisible by both 3 and 5.

// [Note: Print the result in the same format as given below.]

public class DivisibleBy3and5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        
        num = scanner.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by both 3 and 5");
        }
        else{
            System.out.println("Not divisible by both 3 and 5");
        }

        //check the second number
        num = scanner.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by both 3 and 5");
        }
        else{
            System.out.println("Not divisible by both 3 and 5");
        }
        
    }
}

// output:

// 15
// Divisible by both 3 and 5
// 20
// Not divisible by both 3 and 5