package day62_collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        //or polymorphic way
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("first score = " + scores.get(0));
        System.out.println("second number = " + scores.get(1));

        friends.add("Bob");
        friends.add("John");
        friends.add("Tom");
        friends.addFirst("Fred");
        System.out.println(friends);

    }
}
