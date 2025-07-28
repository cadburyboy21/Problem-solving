package Practise;

public class ReverseANum {
    public static void main(String[] args) {
        int s = 121;
        int temp=s;

        int sum = 0;

        while (s > 0) {
            int r = s % 10;
            sum = sum * 10 + r;
            s = s / 10;
        }

        System.out.println(sum);

        if (temp == sum) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
