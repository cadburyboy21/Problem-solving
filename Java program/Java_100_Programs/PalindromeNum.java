package Java_100_Programs;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = sc.nextInt();

        int rev = 0;
        int Org_num = Num;

        while (Num != 0) {
            rev = rev * 10 + Num % 10;
            Num = Num / 10;
        }
 
        if (Org_num == rev) {
            System.out.println(Org_num + " Is Palindrome Number");
        } else {
            System.out.println(Org_num + " Is Not a Palindrome Number");
        }

    }
}
