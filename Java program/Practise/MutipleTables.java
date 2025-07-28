package Practise;

import java.util.Scanner;

public class MutipleTables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for(int i=1;i<=b;i++){
            System.out.println(a+" x "+i+" = "+(i*a));
        }
    }
}
