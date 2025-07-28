package Practise;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int inr=sc.nextInt();
        double todayp=86.31;
        double USD=(inr/todayp);
        System.out.println(USD);
    }
}
