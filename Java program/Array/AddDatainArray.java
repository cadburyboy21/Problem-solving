package Array;

import java.util.Scanner;

public class AddDatainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr);

       
    }
}


// output:

// Enter array size: 5
// Enter 5 elements:
// 1
// 2
// 3
// 4
// 5
// You entered:
// 1
// 2
// 3
// 4
// 5
