package com.skillsoft.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> actorsMap = new HashMap<Integer, String>();

        actorsMap.put(1001, "Tom Hanks");
        actorsMap.put(1002, "Will Smith");
        actorsMap.put(1003, "Bruce Willis");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("******* Adding elements");

        actorsMap.put(1004, "Chris Evans");
        actorsMap.put(1005, "Brad Pitt");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("***** Retrieving elements");

        System.out.format("Key: %s, Value: %s\n", 1003, actorsMap.get(1003));
        System.out.format("Key: %s, Value: %s\n", 1001, actorsMap.get(1001));

        System.out.format("Key: %s, Value: %s\n", 1008, actorsMap.get(1008));

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("***** Deleting elements");
        System.out.println("Actors (original): " + actorsMap);

        actorsMap.remove(1001);
        actorsMap.remove(1003);

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        System.out.println("***** Updating elements");
        System.out.println("Actors (original): " + actorsMap);

        actorsMap.put(1001, "Aamir Khan");
        actorsMap.put(1005, "Amitabh Bachchan");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

//        Map<Integer, String> hashMap = new HashMap<Integer, String>();
//
//        System.out.println("hashMap instanceof HashMap: " + (hashMap instanceof HashMap));
//        System.out.println("hashMap instanceof Map: " + (hashMap instanceof Map));
//
//        System.out.println("hashMap instanceof Collection: " + (hashMap instanceof Collection));
//        System.out.println("hashMap instanceof Iterable: " + (hashMap instanceof Iterable));

//        Map<Integer, String> actorsMap = new HashMap<Integer, String>();
//
//        System.out.println("Actors map empty? : " + actorsMap.isEmpty());
//        System.out.println("Actors map size : " + actorsMap.size());
//
//        System.out.println();
//
//        actorsMap.put(1001, "Tom Hanks");
//        actorsMap.put(1002, "Will Smith");
//        actorsMap.put(1003, "Bruce Willis");
//        actorsMap.put(1004, "Chris Evans");
//        actorsMap.put(1005, "Brad Pitt");
//
//        System.out.println("Actors map empty? (after adding names) : " + actorsMap.isEmpty());
//        System.out.println("Actors map size (after adding names) : " + actorsMap.size());
//
//        System.out.println();
//
//        System.out.println("String representation of map: " + actorsMap);
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