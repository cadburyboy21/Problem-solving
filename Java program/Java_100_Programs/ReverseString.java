package Java_100_Programs;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String Value: ");
        String str=sc.nextLine();
         
        //Method -1

        // String rev="";
        // int len=str.length();

        // for(int i=len-1;i>=0;i--){
        //      rev=rev+str.charAt(i);
        // }
        // System.out.println("The Reversed String: "+rev);

        //Method-2 Using Charachter array

        // String rev="";
        // char a[]=str.toCharArray();
        // int len=a.length;
        // for(int i=len-1;i>=0;i--){
        //     rev=rev+a[i];
        // }
        // System.out.println("The Reversed String: "+rev);

        //Meth0d -3 Using String Buffer

        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
