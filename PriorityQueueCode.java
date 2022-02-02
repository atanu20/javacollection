package mypack;

import java.util.*;

public class PriorityQueueCode {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("nanu");
        queue.add("atanu");
        queue.add("batanu");
        queue.add("kku");
        queue.offer("moo");

        // System.out.println(queue);

        // Write a Java program to iterate through all elements in priority queue.
        // Iterator itr = queue.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // Write a Java program to add all the elements of a priority queue to another
        // priority queue.

        PriorityQueue<String> q = new PriorityQueue<>(queue);
        // System.out.println(q);

        // Write a Java program to insert a given element into a priority queue and
        // remove all.
        // q.offer("nine");
        // System.out.println(q);
        // q.clear();
        // System.out.println(q);
        // first element
        // System.out.println(q.peek());
        // retrieve and remove the first element.
        // System.out.println(q.poll());
        System.out.println(q);
        // Priority Queue elements to a string representation
        System.out.println(q.toString());

    }

}
