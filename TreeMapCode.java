package mypack;

import java.util.*;

public class TreeMapCode {
    public static void main(String[] args) {
        // Write a Java program to associate the specified value with the specified key
        // in a Tree Map
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Red");
        tm.put(2, "Green");
        tm.put(3, "Black");
        tm.put(4, "White");
        tm.put(5, "Blue");
        // System.out.println(tm);
        // Write a Java program to copy a Tree Map content to another Tree Map
        // TreeMap<Integer, String> t = new TreeMap<>();

        // t.putAll(tm);
        // t.put(1, "Rd");
        // t.put(2, "Grn");
        // System.out.println(t);

        // Write a Java program to search a key in a Tree Map
        // System.out.println(tm.containsKey(2)); // true
        // System.out.println(tm.containsKey(12)); // false

        // Write a Java program to search a value in a Tree Map

        // System.out.println(tm.containsValue("Red")); // true
        // System.out.println(tm.containsValue("abc")); // false

        // Write a Java program to get all keys from the given a Tree Map
        // System.out.println(tm.keySet());
        // Set<Integer> keys = tm.keySet();
        // for (int key : keys) {
        // System.out.println(key);
        // }

        // Write a Java program to delete all elements from a given Tree Map
        // System.out.println(tm);
        // tm.clear();
        // System.out.println(tm);

        // Write a Java program to sort keys in Tree Map by using comparator.
        TreeMap<Integer, String> tp = new TreeMap<>(new MyCop());
        tp.put(14, "Red");
        tp.put(2, "Green");
        tp.put(31, "Black");
        tp.put(4, "White");
        tp.put(5, "Blue");
        // tp.put(null, "value"); //null pointer exception
        // System.out.println(tp);
        // Write a Java program to get a key-value mapping associated with the greatest
        // key and the least key in a map.
        // System.out.println("Orginal TreeMap content: " + tm);
        // System.out.println("Greatest key: " + tm.firstEntry());
        // System.out.println("Least key: " + tm.lastEntry());

        // Write a Java program to get the first (lowest) key and the last (highest) key
        // currently in a map

        // System.out.println("Greatest key: " + tm.firstKey());
        // System.out.println("Least key: " + tm.lastKey());

        // Write a Java program to get a reverse order view of the keys contained in a
        // given map

        // System.out.println(tm.descendingKeySet());
        // Write a Java program to get a key-value mapping associated with the greatest
        // key less than or equal to the given key.
        // System.out.println(tm.floorEntry(5));
        // System.out.println(tm.floorEntry(3));

        // Write a Java program to get the greatest key less than or equal to the given
        // key
        // System.out.println(tm.floorKey(6));
        // System.out.println(tm.floorKey(3));
        // Write a Java program to get the portion of a map whose keys are strictly less
        // than a given key
        // System.out.println(tm.headMap(4));

        // Write a Java program to get the portion of this map whose keys are less than
        // (or equal to, if inclusive is true) a given key
        // System.out.println(tm.headMap(4, true));
        // Write a Java program to get the least key strictly greater than the given
        // key. Return null if there is no such key.
        // System.out.println(tm.higherEntry(6)); // null
        // System.out.println(tm.higherEntry(4)); //

        // Write a Java program to get a key-value mapping associated with the greatest
        // key strictly less than the given key. Return null if there is no such key
        // System.out.println(tm.lowerEntry(5));

        // Write a Java program to get the greatest key strictly less than the given
        // key. Return null if there is no such key.

        // System.out.println(tm.lowerKey(5));

        // Write a Java program to get NavigableSet view of the keys contained in a map
        // System.out.println(tm.navigableKeySet());

        // Write a Java program to remove and get a key-value mapping associated with
        // the least key in a map
        // Write a Java program to remove and get a key-value mapping associated with
        // the greatest key in this map
        // System.out.println(tm);
        // System.out.println(tm.pollFirstEntry());
        // System.out.println(tm.pollLastEntry());
        // System.out.println(tm);

        // Write a Java program to get the portion of a map whose keys range from a
        // given key (inclusive), to another key (exclusive).

        // System.out.println(tm.subMap(2, 4));

        // Write a Java program to get the portion of a map whose keys range from a
        // given key to another key
        // System.out.println(tm.subMap(2, true, 4, true));
        // Write a Java program to get a portion of a map whose keys are greater than or
        // equal to a given key
        System.out.println(tm.tailMap(2));
        System.out.println(tm.tailMap(2, false));

    }

}

class MyCop implements Comparator {
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        // return -1;
        return -i1.compareTo(i2);
        // return -o1.toString().compareTo(o2.toString());

    }
}
