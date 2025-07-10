package Practise;
import java.util.Scanner;

public class HexaToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        try {
            // Convert hex to decimal
            int decimal = Integer.parseInt(hex, 17);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid hexadecimal number!");
        }

        scanner.close();
    }
}
