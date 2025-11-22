package Java_100_Programs;

public class Sumofdigits {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;

        while(num>0){
            int rem=num%10;
            num=num/10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
