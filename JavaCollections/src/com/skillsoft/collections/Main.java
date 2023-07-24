package com.skillsoft.collections;

import java.util.*;
import java.util.Map.Entry;


public class Main {

    public static void main(String[] args) {

        SortedMap<Book, Double> treeMap = new TreeMap<Book, Double>();

        treeMap.put(new Book("Catcher in the Rye", "J. D. Salinger"), 4.99);
        treeMap.put(new Book("Pride and Prejudice", "Jane Austen"), 5.99);
        treeMap.put(new Book("To Kill a Mockingbird", "Harper Lee"), 3.99);
        treeMap.put(new Book("The Great Gatsby", "F. Scott Fitzgerald"), 4.49);

        System.out.println("Entries in the order of book name: ");

        for (Entry<Book, Double> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

//        Comparator<Book> bookComparator = new Comparator<Book>() {
//
//            @Override
//            public int compare(Book b1, Book b2) {
//                return b1.getName().toLowerCase().compareTo(b2.getName().toLowerCase());
//            }
//        };
//
//        SortedMap<Book, Double> treeMap = new TreeMap<Book, Double>(bookComparator);
//
//        treeMap.put(new Book("Catcher in the Rye", "J. D. Salinger"), 4.99);
//        treeMap.put(new Book("catcher in the rye", "J. D. Salinger"), 4.99);
//
//        treeMap.put(new Book("Pride and Prejudice", "Jane Austen"), 5.99);
//        treeMap.put(new Book("To Kill a Mockingbird", "Harper Lee"), 3.99);
//        treeMap.put(new Book("The Great Gatsby", "F. Scott Fitzgerald"), 4.49);
//
//        System.out.println("Entries in the order of book name: ");
//
//        for (Entry<Book, Double> entry : treeMap.entrySet()) {
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