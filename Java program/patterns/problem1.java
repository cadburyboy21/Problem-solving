package patterns;

import java.util.Scanner;

// Qn:1

//  *
//  * *
//  * * *
//  * * * *

public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<n;i++){
        //     for(int j=1;j<n-i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Mountain
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  "  );
            }
            for(int j=0;j<=(2*n)-(i*2-1);j++){
                System.out.println("* ");
            }
        }

        
    }
}
