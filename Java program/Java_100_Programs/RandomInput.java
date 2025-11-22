package Java_100_Programs;

import java.util.*;

public class RandomInput {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_int = rand.nextInt(1000);
        System.out.println(rand_int);
    }
}
