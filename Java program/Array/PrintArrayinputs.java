package Array;
import java.util.*;

public class PrintArrayinputs {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=read.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i] =read.nextInt();

        for(int a: arr) System.out.println(arr[a]);
        }
}
