package ConditionalStatement;
import java.util.*;

public class CountNumber {
    public static void main(String[] args) {
        int n=1252225;

        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==2){
                count++;
            }
            n= n/10;
        }
        System.out.println(count);

    }
}
