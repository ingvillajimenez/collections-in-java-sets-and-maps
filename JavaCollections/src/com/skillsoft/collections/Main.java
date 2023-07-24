package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> moviesMap = new HashMap<>();

        System.out.println("**** Any number of nulls allowed in values");

        moviesMap.put(1202, "Titanic");
        moviesMap.put(1203, null);
        moviesMap.put(1501, "Back to the Future");
        moviesMap.put(1884, "The Godfather");
        moviesMap.put(2932, "Casablanca");
        moviesMap.put(6929, null);

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        System.out.println("**** The key can be null as well, considered unique");

        moviesMap.put(null, "Jaws");

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Values: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        System.out.println("**** Only one null key allowed in any map");

        moviesMap.put(null, "The Godfather II");

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Values: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

//        Map<Integer, String> moviesMap = new HashMap<>();
//
//        moviesMap.put(1202, "Titanic");
//        moviesMap.put(1203, "Jaws");
//        moviesMap.put(1501, "Back to the Future");
//        moviesMap.put(1884, "The Godfather");
//        moviesMap.put(2932, "Casablanca");
//        moviesMap.put(6929, "Titanic");
//
//        // NOTE: Java Map implementations returns the same collection object each
//        // time when we access the collection view of a map
//        Set<Map.Entry<Integer, String>> entrySet = moviesMap.entrySet();
//
//        for (Map.Entry<Integer, String> entry : entrySet) {
//            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
//        }
//
//        for (Map.Entry<Integer, String> entry : entrySet) {
//
//            if (entry.getKey() == 1884) {
//                entry.setValue("The Godfather II");
//            }
//        }
//        System.out.println("\nSet view of the entries (updated): " + entrySet);
//
//
//        Set<Integer> keySet = moviesMap.keySet();
//
//        System.out.println("\nSet view of keys (will not have duplicates): " + keySet);
//
//        for (Integer key : keySet) {
//            System.out.println(key + " - " + moviesMap.get(key));
//        }
//
//
//        Collection<String> values = moviesMap.values();
//
//        System.out.println("\nCollection view of values (may contain duplicates): " + values);
    }
}

// Sets
// Unordered collection of elements which do not allow duplicates

// Equality checks
// Performed using the .equals() and .hashCode() method on objects

// Comparing Elements in a TreeSet
// Objects implement the Comparable interface or the TreeSet uses a separate Comparator

// compareTo()
// Result is positive, negative, or zero. The magnitude of the values does not matter
// Only method of the functional interface Comparable

// Comparator vs. Comparable
// Comparator allows us to sort objects without modifying the original class

// Maps
// Containers that contain mappings from keys to values