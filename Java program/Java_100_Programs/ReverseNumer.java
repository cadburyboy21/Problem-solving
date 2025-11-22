package Java_100_Programs;

import java.util.*;

public class ReverseNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        int num = sc.nextInt();

        // int rev = 0;

        //Logic-1
        // while (num != 0) {
        //     rev = rev * 10 + num % 10;
        //     num = num / 10;
        // }

        //Logic-2 Using StringBuffer class
        // StringBuffer sb= new StringBuffer(String.valueOf(num));
        // StringBuffer rev=sb.reverse();

        // System.out.println("The reversed Values is: " + rev);

        // Logic-3 Uing StringBuilder
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();

        System.out.println("The reversed Values is: " + rev);
    }
}
