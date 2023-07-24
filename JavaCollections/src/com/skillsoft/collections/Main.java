package com.skillsoft.collections;

import java.util.*;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {

        Comparator<String> stringLengthComparator = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        SortedMap<String, String> treeMap = new TreeMap<String, String>(stringLengthComparator);

        treeMap.put("Pablo Picasso", "Guarnica");
        treeMap.put("Salvador Dali", "The Persistence of Memory");

        treeMap.put("Vincent van Gogh", "The Starry Night");
        treeMap.put("Johannes Vermeer", "Girl with a Pearl Earring");

        treeMap.put("Leonardo da Vinci", "Mona Lisa");

        System.out.println("Entries in the order of the key string length: ");

        for (Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

//        Comparator<String> descendingStringComparator = new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2) * -1;
//            }
//        };
//
//        SortedMap<String, String> treeMap = new TreeMap<String, String>(descendingStringComparator);
//
//        treeMap.put("Pablo Picasso", "Guarnica");
//        treeMap.put("Leonardo da Vinci", "Mona Lisa");
//        treeMap.put("Vincent van Gogh", "The Starry Night");
//        treeMap.put("Salvador Dali", "The Persistence of Memory");
//        treeMap.put("Johannes Vermeer", "Girl with a Pearl Earring");
//
//        System.out.println("Entries in reverse order: ");
//
//        for (Entry<String, String> entry : treeMap.entrySet()) {
//            System.out.println(entry);
//        }

//        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1.compareTo(i2) * -1;
//            }
//        };
//
//        SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>(descendingComparator);
//
//        treeMap.put(1784, "Back to the future");
//        treeMap.put(1503, "Titanic");
//        treeMap.put(1202, "Jaws");
//        treeMap.put(1501, "Forrest Gump");
//        treeMap.put(1277, "The Godfather");
//
//        System.out.println("Entries in the reverse order: ");
//
//        for (Entry<Integer, String> entry : treeMap.entrySet()) {
//            System.out.println(entry);
//        }

//        SortedMap<Integer, String> treeMap = new TreeMap<>();
//
//        treeMap.put(1784, "Back to the future");
//        treeMap.put(1503, "Titanic");
//        treeMap.put(1202, "Jaws");
//        treeMap.put(1501, "Forrest Gump");
//        treeMap.put(1277, "The Godfather");
//
//        System.out.println("Entries in the natural order: ");
//
//        for (Entry<Integer, String> entry : treeMap.entrySet()) {
//            System.out.println(entry);
//        }
//
//        treeMap.put(null, "Bob"); // java.lang.NullPointerException
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