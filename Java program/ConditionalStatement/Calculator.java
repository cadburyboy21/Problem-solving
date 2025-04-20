package ConditionalStatement;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int ans=0;
        
        System.out.println("Enter the Operator:");
        while(true){
            char op=input.next().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter The Two numbers:");
                int num1=input.nextInt();
                int num2=input.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0)
                    ans=num1/num2;
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                
            }
            System.out.println(ans);
        }
        
    }
}
