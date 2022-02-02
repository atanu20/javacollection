package mypack;

import java.util.*;

public class HashMapCode {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(1, "Red");
        h.put(2, "Green");
        h.put(3, "Black");
        h.put(4, "White");
        h.put(5, "Blue");
        // h.put(null, "Blue");
        // h.put(null, "Blune");
        // System.out.println(h);

        // Write a Java program to count the number of key-value (size) mappings in a
        // map
        // System.out.println(h.size());

        // Write a Java program to copy all of the mappings from the specified map to
        // another map
        // HashMap<Integer, String> hh = new HashMap<Integer, String>(h);
        // System.out.println(hh);

        // HashMap<Integer, String> hh = new HashMap<Integer, String>();
        // hh.putAll(h);
        // System.out.println(hh);

        // Write a Java program to check whether a map contains key-value mappings
        // (empty) or not
        // System.out.println(h.isEmpty());
        // h.clear();
        // System.out.println(h.isEmpty());
        // System.out.println(h);

        // Write a Java program to test if a map contains a mapping for the specified
        // key.

        // System.out.println(h.containsKey(8)); //false

        // Write a Java program to test if a map contains a mapping for the specified
        // value
        // System.out.println(h.containsValue("at")); // false
        // System.out.println(h.containsValue("Red")); // true

        // Write a Java program to create a set view of the mappings contained in a map
        // Set set = h.entrySet();
        // System.out.println(set);

        // Write a Java program to get the value of a specified key in a map
        // System.out.println(h.get(5)); //blue
        // System.out.println(h.get(6)); //null

        // Write a Java program to get a set view of the keys contained in this map.
        System.out.println(h.keySet());

        // Write a Java program to get a collection view of the values contained in this
        // map
        System.out.println(h.values());
    }
}
