package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] integersArray = new Integer[] {3300, 400, 100, 700, 900, 600};

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(integersArray));

        System.out.println("\nOrder of integers in a TreeSet (natural order)");

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        treeSet.add(null); // java.lang.NullPointerException

//        String[] carsArray = new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};
//
//        Set<String> hashSet = new HashSet<>(Arrays.asList(carsArray));
//        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carsArray));
//        Set<String> treeSet = new TreeSet<>(Arrays.asList(carsArray));
//
//        System.out.println("Order of car names in a HashSet (random order)");
//
//        for (String name : hashSet) {
//            System.out.println(name);
//        }
//
//        System.out.println("\nOrder of car names in a LinkedHashSet (insertion order)");
//
//        for (String name : linkedHashSet) {
//            System.out.println(name);
//        }
//
//        System.out.println("\nOrder of car names in a TreeSet (natural order)");
//
//        for (String name : treeSet) {
//            System.out.println(name);
//        }

//        Set<String> hashSet = new HashSet<>();
//
//        System.out.println("hashSet instanceof HashSet " + (hashSet instanceof HashSet));
//        System.out.println("hashSet instanceof Set " + (hashSet instanceof Set));
//        System.out.println("hashSet instanceof Collection " + (hashSet instanceof Collection));
//        System.out.println("hashSet instanceof Iterable " + (hashSet instanceof Iterable));
//
//        System.out.println();
//
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//
//        System.out.println("linkedHashSet instanceof linkedHashSet " + (linkedHashSet instanceof LinkedHashSet));
//        System.out.println("linkedHashSet instanceof HashSet " + (linkedHashSet instanceof HashSet));
//        System.out.println("linkedHashSet instanceof Set " + (linkedHashSet instanceof Set));
//        System.out.println("linkedHashSet instanceof Collection " + (linkedHashSet instanceof Collection));
//        System.out.println("linkedHashSet instanceof Iterable " + (linkedHashSet instanceof Iterable));
//
//        System.out.println();
//
//        Set<String> treeSet = new TreeSet<>();
//
//        System.out.println("treeSet instanceof TreeSet " + (treeSet instanceof TreeSet));
//        System.out.println("treeSet instanceof SortedSet " + (treeSet instanceof SortedSet));
//        System.out.println("treeSet instanceof Set " + (treeSet instanceof Set));
//        System.out.println("treeSet instanceof Collection " + (treeSet instanceof Collection));
//        System.out.println("treeSet instanceof Iterable " + (treeSet instanceof Iterable));
//
//        System.out.println();
    }
}

// Sets
// Unordered collection of elements which do not allow duplicates

// Equality checks
// Performed using the .equals() and .hashCode() method on objects