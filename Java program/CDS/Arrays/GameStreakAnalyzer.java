package CDS.Arrays;
import java.util.Scanner;

public class GameStreakAnalyzer {

    public static int findLongestStreak(int[] scores) {
        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[i - 1]) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 1;
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] input = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int result = findLongestStreak(input);
        System.out.println("Longest streak length: " + result);
        
        sc.close();
    }
}

// Output:

// Enter number of elements: 7
// Enter 7 elements:
// 1
// 2
// 3
// 2
// 4
// 5
// 6
// Longest streak length: 4