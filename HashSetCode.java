package mypack;

import java.util.*;

public class HashSetCode {
    public static void main(String[] args) {
        // Write a Java program to append the specified element to the end of a hash
        // set.
        HashSet<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(120);
        s.add(200);
        s.add(150);
        s.add(230);
        // System.out.println(s);

        // Write a Java program to iterate through all elements in a hash list
        // Iterator itr = s.iterator();
        // while (itr.hasNext()) {
        // // System.out.println(itr.next());
        // }

        // Write a Java program to get the number of elements in a hash set and empty it
        // System.out.println(s.size());
        // s.clear();
        // System.out.println(s);

        // Write a Java program to clone a hash set to another hash set

        HashSet<String> str = new HashSet<>();
        str.add("atb");
        str.add("atb2");
        str.add("atb4");
        str.add("atnuooo");

        // System.out.println(str);
        // for (String i : str) {
        // System.out.println(i);

        // }

        Set<String> st = new HashSet<>();
        st = (Set) str.clone();
        st.add("atb4");
        st.add("atnu");
        st.add("atnub");

        // System.out.println(st);

        // Write a Java program to convert a hash set to an array
        // String ab[] = str.toArray(new String[str.size()]);
        // for (String i : ab) {
        // System.out.println(i);
        // }

        // Write a Java program to convert a hash set to a List/ArrayList

        // List<String> l = new ArrayList<>(str);
        // System.out.println(l);

        // Write a Java program to compare two hash set
        // System.out.println(str.equals(st));

        // Compare two sets and retain elements which are same on both sets

        // str.retainAll(st);
        // System.out.println(str);

    }

}
