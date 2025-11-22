package Java_100_Programs;

public class Swapping2numbers {
     public static void main(String[] args) {

        
        int a = 10, b = 20;

        System.out.println("Before swapping: A = " + a + ", B = " + b);
        //Logic 1 with Temp
        // int t = a;
        // a = b;
        // b = t;

        //Logic-2 Using + and - without using of third variable
        // a=a+b;
        // b=a-b;
        // a=a-b;

        //logic-3 using * and / only for a and b Non zero values
        a=a*b;
        b=a/b;
        a=a/b;


        System.out.println("After swapping: A = " + a + ", B = " + b);
    }
}
