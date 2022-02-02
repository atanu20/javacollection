package mypack;

import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class TreeSetCode {
    public static void main(String[] args) {
        // Set<Integer> t = new TreeSet<>();// ascending sort /default sort / comparable
        // TreeSet<Integer> t = new TreeSet<>();
        // t.add(10);
        // t.add(20);
        // t.add(120);
        // t.add(200);
        // t.add(150);
        // t.add(230);
        // System.out.println(t);
        Set<String> st = new TreeSet<>(new MyComp());
        st.add("raj");
        st.add("atanu");
        st.add("dad");
        // System.out.println(st);

        // Write a Java program to create a reverse order view of the elements contained
        // in a given tree set.

        TreeSet<String> t_set = new TreeSet<String>();

        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("Pink");
        t_set.add("orange");

        // System.out.println(t_set.descendingSet());

        // Write a Java program to get the first and last elements in a tree set
        // System.out.println(t_set);
        // System.out.println(t_set.first());
        // System.out.println(t_set.last());

        // Write a Java program to clone a tree set list to another tree set
        TreeSet<String> tset = new TreeSet<String>();
        tset = (TreeSet) t_set.clone();
        // System.out.println(tset);

        // Write a Java program to get the number of elements in a tree set
        // System.out.println(t_set.size());

        // Write a Java program to compare two tree sets

        // System.out.println(t_set.equals(tset));

        // Write a Java program to find the numbers less than 7 in a tree set
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(12);
        t.add(7);
        t.add(5);
        t.add(23);
        // System.out.println(t);
        // for (int i : t) {
        // if (i < 7) {
        // System.out.println(i);
        // }
        // }

        // TreeSet<Integer> treeheadset = new TreeSet<Integer>();
        // treeheadset = (TreeSet) t.headSet(7);
        // System.out.println(treeheadset);

        // Write a Java program to get the element in a tree set which is greater than
        // or equal to the given element

        // System.out.println(t.ceiling(6)); // 7
        // Write a Java program to get the element in a tree set which is less than or
        // equal to the given element

        // System.out.println(t.floor(6));
        // Write a Java program to get the element in a tree set which is strictly
        // greater than or equal to the given element
        // System.out.println(t.higher(6));

        // Write a Java program to get an element in a tree set which is strictly less
        // than the given element.
        // System.out.println(t.lower(6));

        // Write a Java program to retrieve and remove the first element of a tree set;
        // System.out.println(t);
        // System.out.println(t.pollFirst());
        // System.out.println(t.pollLast());
        // System.out.println(t);
        // Remove a given element from a tree set
        // t.remove(5);
        // System.out.println(t);

    }

}

// class MyCom implements Comparator {
// public int compare(Object o1, Object o2) {
// Integer i1 = (Integer) o1;
// Integer i2 = (Integer) o2;

// if (i1 < i2)
// return 1;
// else if (i1 > i2)
// return -1;
// else
// return 0;
// }
// }

class MyComp implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        // return -1;
        return -s1.compareTo(s2);
        // return -o1.toString().compareTo(o2.toString());

    }
}