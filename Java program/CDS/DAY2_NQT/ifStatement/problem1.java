package CDS.DAY2_NQT.ifStatement;

import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();

        if (age <= 11) {
            System.out.println("Not Eligibile for Football");
        } else if (age <= 20 || age <= 60) {
            System.out.println("Pay 200 Rs");
        } else {
            System.out.println("Pay 120 Rs");
        }

    }

}
