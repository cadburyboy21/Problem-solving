package CDS.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int count = scanner.nextInt();
        scanner.nextLine(); 

    
        for (int i = 0; i < count; i++) {
            System.out.print("Enter product " + (i + 1) + ": ");
            String product = scanner.nextLine();
            products.add(product);
        }


        System.out.println("\nProducts:");
        for (String product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}

// Output

// Enter the number of products:
// 2
// Enter product 1: pen
// Enter product 2: scale

// Products:
// pen
// scale