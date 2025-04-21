package ConditionalStatement.Functions.Methods;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        sum();
    }
    
    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number1:");
        int num1 = input.nextInt();

        System.out.println("Enter the number2:");
        int num2= input.nextInt();
        
        int sum=num1+num2;

        System.out.println("The Sum of Two numbers is "+ sum);
    }

}
