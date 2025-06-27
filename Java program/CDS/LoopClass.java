package CDS;

import java.util.Scanner;

public class LoopClass {
    public static void Loop(int n){
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        Loop(n);
        
    }
}
