package ConditionalStatement;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345;
        int Ans=0;

        while(num > 0){
            int rem=num%10;
            num=num/10;
            Ans=Ans*10+rem;
        }
        System.out.println(Ans);
    }
}
