package Java_100_Programs;

public class Fibonacci {
    public static void main(String[] args) {
        int start = 0;
        int end = 13;
        int second = 1;
        int sum = 0;
        System.out.println(start);
        System.out.println(second);

        while (sum < end) {
            sum = start + second;
            start = second;
            second = sum;
            System.out.println(sum);
        }

    }
}
