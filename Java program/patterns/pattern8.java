package patterns;

import java.util.Scanner;

// Qn-8

// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *

public class pattern8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
        }

    }

}
