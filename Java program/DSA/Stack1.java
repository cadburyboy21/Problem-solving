package DSA;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();  //LIFO

        stack.push("Book1");
         stack.push("Book2");
          stack.push("Book3");
           stack.push("Book4");
            stack.push("Book5");


            String Favbook=stack.pop();// Remove the book5
            // stack.pop();// Remove the book4


            // System.out.println(stack.empty());
            System.out.println("My Fav Book: "+Favbook);
            System.out.println(stack.peek());
            System.out.println(stack);
            System.out.println(stack.search("Book1"));
    }
    
}
