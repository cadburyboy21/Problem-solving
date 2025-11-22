// package Java_100_Programs;

// import java.util.Scanner;

// public class EqualityofTwoArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr1[] = new int[n];
//         int arr2[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.nextInt();
//         }
//         int c = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr1[i] == arr2[i]) {
//                 c++;
//             }
//         }
//         if (c == n) {
//             System.out.println("Equal");
//         } else {
//             System.out.println("Not Equal");
//         }

//     }
// }

package Java_100_Programs;

import java.util.Scanner;

public class EqualityofTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean bool=true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                bool=false;
            }
        }
        if (bool) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
