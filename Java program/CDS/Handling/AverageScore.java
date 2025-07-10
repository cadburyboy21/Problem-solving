package CDS.Handling;  // Only include this if you’re using packages

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[3]; 

        try {
            System.out.println("Enter 3 scores:");
            for (int i = 0; i < scores.length; i++) {
                scores[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int score : scores) {
                sum += score;
            }

            int average = sum / scores.length;
            System.out.println("Average Score: " + average);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            scanner.close(); 
        }
    }
}
