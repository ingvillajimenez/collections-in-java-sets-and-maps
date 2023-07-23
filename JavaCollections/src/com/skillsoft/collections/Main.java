package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        SortedSet<String> vowelSet = new TreeSet<>();


        vowelSet.add("A");
        vowelSet.add("E");
        vowelSet.add("I");
        vowelSet.add("O");
        vowelSet.add("U");

        System.out.println("Vowels are: " + vowelSet);

        System.out.println("First vowel: " + vowelSet.first());
        System.out.println("Last vowel: " + vowelSet.last());

        System.out.println();

        System.out.println("Vowels which come before I: " + vowelSet.headSet("I"));
        System.out.println("Vowels which come after I (includes I): " + vowelSet.tailSet("I"));

        System.out.println();

        System.out.println("Vowels which comes between E and U (includes E): " + vowelSet.subSet("E", "U"));

        System.out.println();

//        System.out.println("A compareTo B: " + ("A".compareTo("B")));
//        System.out.println("A compareTo Z: " + ("A".compareTo("Z")));
//
//        System.out.println("B compareTo A: " + ("B".compareTo("A")));
//        System.out.println("Z compareTo A: " + ("Z".compareTo("A")));
//
//        System.out.println("L compareTo L: " + ("L".compareTo("L")));
//        System.out.println("X compareTo X: " + ("X".compareTo("X")));
//
//        System.out.println("A compareTo a: " + ("A".compareTo("a")));
//        System.out.println("b compareTo B: " + ("b".compareTo("B")));
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