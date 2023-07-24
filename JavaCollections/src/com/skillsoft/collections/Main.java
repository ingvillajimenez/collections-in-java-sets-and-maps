package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1784, "The Godfather");
        hashMap.put(1202, "Titanic");
        hashMap.put(1503, "Jaws");
        hashMap.put(1501, "Saving Private Ryan");

        System.out.println("\n*****Order of entries in a HashMap (random)");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1784, "The Godfather");
        linkedHashMap.put(1202, "Titanic");
        linkedHashMap.put(1503, "Jaws");
        linkedHashMap.put(1501, "Saving Private Ryan");

        System.out.println("\n******Order of entries in a LinkedHashMap (insertion order)");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1784, "The Godfather");
        treeMap.put(1202, "Titanic");
        treeMap.put(1503, "Jaws");
        treeMap.put(1501, "Saving Private Ryan");

        System.out.println("\n*****Order of entries in a TreeMap (natural order of keys)");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

//        Map<Integer, String> hashMap = new HashMap<Integer, String>();
//
//        System.out.println("hashMap instanceof HashMap " + (hashMap instanceof HashMap));
//        System.out.println("hashMap instanceof Map " + (hashMap instanceof Map));
//
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
//
//        System.out.println("\nlinkedHashMap instanceof LinkedHashMap " +
//                (linkedHashMap instanceof LinkedHashMap));
//        System.out.println("linkedHashMap instanceof HashMap " +
//                (linkedHashMap instanceof HashMap));
//        System.out.println("linkedHashMap instanceof Map " +
//                (linkedHashMap  instanceof Map));
//
//        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
//
//        System.out.println("\ntreeMap instanceof TreeMap " + (treeMap instanceof TreeMap));
//        System.out.println("treeMap instanceof SortedMap " + (treeMap instanceof SortedMap));
//        System.out.println("treeMap instanceof Map " + (treeMap instanceof Map));

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