package mypack;

import java.util.*;

/* Write a Java program to create a new array list, add some colors (string) and print out the collection.
 Write a Java program to iterate through all elements in a array list.
 Write a Java program to update specific array element by given element
 Write a Java program to insert an element into the array list at the first position

 */

public class ArrayListCode {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        l.add("atanu");
        l.add("atanu1");
        l.add("atanu2");
        // System.out.println(l);
        // Write a Java program to copy one array list into another
        // Write a Java program to clone an array list to another array list
        // List<String> ll = new ArrayList<String>(l);
        List<String> ll = new ArrayList<String>();
        ll.add("aatanu12");
        ll.add("atanu");
        ll.add("atanu12");

        ll.addAll(l);
        // System.out.println(ll);

        // for (String n : ll) {
        // System.out.println(n);
        // }
        // System.out.println("set use");
        // ll.set(4, "somu");

        // for (int i = 0; i < ll.size(); i++) {
        // System.out.println(ll.get(i));
        // }

        // ll.remove(4);

        // Iterator itr = ll.iterator();
        // while (itr.hasNext()) {
        // String ab = (String) itr.next();
        // System.out.println(ab);

        // }

        // System.out.println(ll.lastIndexOf("atanu12"));
        // System.out.println(ll.indexOf("atanu"));
        // System.out.println(ll);

        ll.add(0, "code");
        // System.out.println(ll);

        // Write a Java program to remove the third element from a array list

        ll.remove(2);
        // System.out.println(ll);

        // Write a Java program to search an element in a array list.
        // System.out.println(ll.contains("code")); // true

        // Write a Java program to sort a given array list
        // Collections.sort(ll);
        // System.out.println(ll);

        // Write a Java program to shuffle elements in a array list
        // Collections.shuffle(ll);
        // System.out.println(ll);

        // Write a Java program to reverse elements in a array list
        // System.out.println(ll);
        // Collections.reverse(ll);
        // System.out.println(ll);

        // Write a Java program to extract a portion of a array list
        // System.out.println(ll.subList(1, 3));

        // Write a Java program to compare two array lists

        // System.out.println(ll.equals(l));
        // ArrayList<String> c3 = new ArrayList<String>();
        // for (String e : ll)
        // c3.add(l.contains(e) ? "Yes" : "No");
        // System.out.println(c3);

        // Write a Java program of swap two elements in an array list
        // Collections.swap(ll, 0, 2);
        // System.out.println(ll);
        // ArrayList<String> c1= new ArrayList<String>();
        // c1.add("Red");
        // c1.add("Green");
        // c1.add("Black");
        // c1.add("White");
        // c1.add("Pink");

        // System.out.println("Array list before Swap:");
        // for(String a: c1){
        // System.out.println(a);
        // }
        // //Swapping 1st(index 0) element with the 3rd(index 2) element
        // Collections.swap(c1, 0, 2);
        // System.out.println("Array list after swap:");
        // for(String b: c1){
        // System.out.println(b);
        // }

        // Write a Java program to join two array lists
        // ArrayList<String> c1 = new ArrayList<String>();
        // c1.add("Red");
        // c1.add("Green");
        // c1.add("Black");
        // c1.add("White");
        // c1.add("Pink");

        // ArrayList<String> c2 = new ArrayList<String>();
        // c2.add("Red2");
        // c2.add("Green2");
        // c2.add("Black2");
        // c2.add("White2");
        // c2.add("Pink2");

        // ArrayList<String> all = new ArrayList<String>();
        // all.addAll(c1);
        // all.addAll(c2);
        // System.out.println(all);

        // Write a Java program to empty an array list
        // ll.clear();
        // System.out.println(ll);

        // Write a Java program to test an array list is empty or not

        // System.out.println(ll.isEmpty());

        // Write a Java program to trim the capacity of an array list the current list

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
    }

}
