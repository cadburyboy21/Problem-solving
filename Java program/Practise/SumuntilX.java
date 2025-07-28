package Practise;

import java.util.Scanner;

public class SumuntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum. Type 'x' to finish:");

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to exit.");
            }
        }

        System.out.println("Total sum: " + sum);

    }
}
