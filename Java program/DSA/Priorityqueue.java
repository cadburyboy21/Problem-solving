package DSA;
import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(2.0);
        queue.offer(1.5);
        queue.offer(1.0);
        queue.offer(3.5);
        queue.offer(5.3);
        queue.offer(10.1);

        // while (!queue.isEmpty()) {
        // queue.poll(); // remove 1.0
        //  queue.poll(); // remove 1.5
         System.out.println(queue);
            
        // }
    }
}
