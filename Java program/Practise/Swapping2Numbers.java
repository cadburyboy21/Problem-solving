package Practise;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swapping: A = " + a + ", B = " + b);

        int t = a;
        a = b;
        b = t;

        System.out.println("After swapping: A = " + a + ", B = " + b);
    }
}
