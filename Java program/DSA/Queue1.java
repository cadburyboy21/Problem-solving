package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<String>(); // FIFO

        System.out.println(queue.isEmpty()); // prints true
        queue.offer("Tamil");
        queue.offer("English");
        queue.offer("Maths");
        queue.offer("Science");
        queue.offer("Social");

        System.out.println(queue.isEmpty()); // prints false
        System.out.println(queue.size()); // prints 5
        System.out.println(queue.contains("Maths")); // print true Search  the String is present r Not.

        
        queue.poll(); // poll() used to remove "Tamil" FIFO-method
        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.poll();
        queue.element();
        System.out.println(queue);
        
        

    }
}
