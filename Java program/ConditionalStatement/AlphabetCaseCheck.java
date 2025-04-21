package ConditionalStatement;
import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    char ch =input.next().charAt(0);

    if(ch >='a' && ch <='z'){
        System.out.println("LowerCase");
    }
    else {
        System.out.println("UpperCase");
    }
    }
}
