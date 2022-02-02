package mypack;

import java.util.*;

public class LinkListCode {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(40);
        l.add(30);
        // System.out.println(l);
        // Iterator itr = l.iterator();
        // while (itr.hasNext()) {
        // Integer s1 = (Integer) itr.next();
        // System.out.println(s1); //10,40,30
        // }

        // Write a Java program to iterate through all elements in a linked list
        // starting at the specified position
        // Iterator itr = l.listIterator(1); // possible
        // // Iterator itr = l.iterator(1); //xxxx not possible
        // while (itr.hasNext()) {
        // // Integer s1 = (Integer) itr.next();
        // System.out.println(itr.next()); // 10,40,30
        // }

        // Write a Java program to iterate a linked list in sorted order
        // Collections.sort(l, (o1, o2) -> (o1 - o2)); //with lambda function asending /
        // (o1, o2) -> -(o1 - o2) for desc
        // Collections.sort(l); // default asending
        // System.out.println(l);

        // Write a Java program to iterate a linked list in reverse order.
        // Collections.reverse(l);
        // System.out.println(l);

        // Insert the specified element at the specified position in the linked list
        // l.add(0, 50);

        // System.out.println(l);

        LinkedList<String> list = new LinkedList<String>();

        list.add("Geeks");
        list.add("55");
        list.add("Geekks");
        list.add("55");
        // Write a Java program to insert elements into the linked list at the first and
        // last position
        list.addFirst("65");
        list.addLast("12");
        // Write a Java program to insert the specified element at the specified
        // position in the linked list
        list.add(0, "45");
        // System.out.println(list);
        // System.out.println(list.removeFirst());
        // System.out.println(list.removeLast());

        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());

        // Write a Java program to get the first and last occurrence of the specified
        // elements in a linked list

        // System.out.println(list.indexOf("55"));
        // System.out.println(list.lastIndexOf("55"));

        // Write a Java program to remove all the elements from a linked list
        // list.clear();
        // System.out.println(list);

        // Write a Java program of swap two elements in a linked list

        // Collections.swap(list, 1, 2);

        // System.out.println(list);

        // Write a Java program to join two linked lists

        // List<Integer> l1 = new LinkedList<Integer>();
        // l1.add(20);
        // l1.add(120);

        // LinkedList<Integer> l2 = new LinkedList<Integer>();
        // l2.add(210);
        // l2.add(520);

        // System.out.println(l1);
        // System.out.println(l2);

        // List<Integer> l3 = new LinkedList<Integer>(l2);
        // l3.addAll(l1);

        // System.out.println(l3);
        // Write a Java program to clone an linked list to another linked list
        // LinkedList<Integer> l1 = new LinkedList<Integer>();
        // l1.add(20);
        // l1.add(120);
        // List<Integer> l3 = new LinkedList<Integer>();
        // l3 = (List) l1.clone();
        // System.out.println(l3);

        // Write a Java program to convert a linked list to array list.

    }
}
