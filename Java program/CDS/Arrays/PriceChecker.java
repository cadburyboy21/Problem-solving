package CDS.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PriceChecker {
    public static boolean hasDuplicatePrices(int[] prices) {
        HashSet<Integer> seen = new HashSet<>();
        for (int price : prices) {
            if (seen.contains(price)) {
                return true; 
            }
            seen.add(price); 
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of prices: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter " + n + " prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        boolean result = hasDuplicatePrices(prices);
        System.out.println("Has duplicate prices: " + result);
    }
}

// Output:

// Enter the number of prices: 7
// Enter 7 prices:
// 5
// 10
// 15
// 20
// 25
// 30
// 5
// Has duplicate prices: true