package Practise;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int count = 0;

        // while (temp > 0) {
        //     temp = temp / 10;
        //     count++;

        // }
        // System.out.println(count);

        count=String.valueOf(n).length();
        System.out.println(count);

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            double Pow = Math.pow(r, count);
            sum += Pow;
            temp = temp / 10;
        }
        System.out.println(sum);

        if (n == sum)
            System.out.println("Its a ArmStrong Number");
        else
            System.out.println("Its Not a ArmStrong Number");

    }
}
