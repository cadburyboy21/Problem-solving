package Java_100_Programs;

public class LargestNum {
    public static void main(String[] args) {
        int num=75459;
        int t=0,rev=0;

        while(num>0){
            rev=num%10;
            num=num/10;

            if(rev>t){
                t=rev;
            }
        }
        System.out.println(t);
    }
}
