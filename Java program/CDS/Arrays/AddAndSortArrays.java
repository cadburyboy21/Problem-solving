package CDS.Arrays;
    
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] sumArray = new int[size];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> lst=new ArrayList<>();
        lst.Add(arr1+arr2);

        System.out.println("Marged Inventory:");
        for (int value : sumArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

