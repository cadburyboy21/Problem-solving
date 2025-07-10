package CDS;

import java.util.Scanner;

public class FibonacciReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int[] fib = new int[n];
        
        // Generate Fibonacci sequence
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print in reverse order
        System.out.println("Fibonacci in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
        }
    }
}
