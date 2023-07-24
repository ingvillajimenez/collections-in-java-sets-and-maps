package com.skillsoft.collections;

import java.util.*;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {

        SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1202, "Sam");
        treeMap.put(1503, "Tom");
        treeMap.put(1501, "Ronald");
        treeMap.put(1784, "Ursula");
        treeMap.put(1277, "Dan");

        System.out.println("employeesMap: " + treeMap);

        System.out.println("\nFirst key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        System.out.println("\nMap with all keys strictly less than 1501: " + treeMap.headMap(1501));
        System.out.println("\nMap with all keys greater than or equal to 1503: " + treeMap.tailMap(1503));

        System.out.println("\nMap with all keys greater than or equal to 1277 and less than 1503: " +
                treeMap.subMap(1277, 1503));

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

// Cache
// Smaller sized faster store for quick look ups of commonly used data

// LRU (Least Recently Used) Cache
// Keeps around data that is frequently accessed and evicts data that is rarely accessed