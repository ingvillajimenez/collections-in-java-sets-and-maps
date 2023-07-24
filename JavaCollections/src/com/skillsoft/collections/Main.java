package com.skillsoft.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {

        Map<Integer, String> lruCache = new LRUCache();

        lruCache.put(1784, "The Godfather");
        lruCache.put(1202, "Titanic");
        lruCache.put(1503, "Jaws");
        lruCache.put(1501, "Saving Private Ryan");
        lruCache.put(2501, "Back to the Future");

        System.out.println("Added exactly 5 entries\n");

        for (Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }

        lruCache.put(3000, "The Parasite");
        lruCache.put(4000, "It's a Beautiful Life");

        System.out.println("\nOnly the 5 most recently accessed entries will be preserved\n");

        for (Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }

        lruCache.get(1503);
        lruCache.get(2501);

        System.out.println("\nAccessed Jaws and Back to the Future");

        for (Entry<Integer, String> entry : lruCache.entrySet()) {
            System.out.println(entry);
        }

//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(
//                16, 0.75f, true);
//
//        linkedHashMap.put(1784, "The Godfather");
//        linkedHashMap.put(1202, "Titanic");
//        linkedHashMap.put(1503, "Jaws");
//        linkedHashMap.put(1501, "Saving Private Ryan");
//
//        System.out.println("Insertion order since no entry has been accessed yet\n");
//
//        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry);
//        }
//
//        linkedHashMap.get(1202);
//
//        System.out.println("\nAccess order of entries (accessed Titanic) \n");
//
//        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry);
//        }
//
//        linkedHashMap.get(1501);
//
//        System.out.println("\nAccess order of entries (accessed Saving Private Ryan)\n");
//
//        for (Entry<Integer, String> entry : linkedHashMap.entrySet()) {
//            System.out.println(entry);
//        }
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