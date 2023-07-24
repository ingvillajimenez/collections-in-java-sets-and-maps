package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Movie, Float> moviesMap = new HashMap<>();

        System.out.println("**** Keys can be custom objects");

        moviesMap.put(new Movie("Titanic", "Leonardo DiCaprio"), 8.8f);
        moviesMap.put(new Movie("Back to the Future", "Michael J. Fox"), 8.3f);
        moviesMap.put(new Movie("The Godfather", "Al Pacino"), 9.3f);
        moviesMap.put(new Movie("Casablanca", "Humphrey Bogart"), 8.9f);

        for (Map.Entry<Movie, Float> entry : moviesMap.entrySet()) {
            System.out.format("Key: %s, Value: %.1f\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        System.out.println("**** Duplicate entries for the same movie");

        Movie anotherGodfather = new Movie("The Godfather", "Al Pacino");

        moviesMap.put(anotherGodfather, 5.4f);

        for (Map.Entry<Movie, Float> entry : moviesMap.entrySet()) {
            System.out.format("Key: %s, Value: %.1f\n", entry.getKey(), entry.getValue());
        }

//        Map<Integer, Movie> moviesMap = new HashMap<>();
//
//        System.out.println("**** Values can be custom objects");
//
//        moviesMap.put(1202, new Movie("Titanic", "Leonardo DiCaprio"));
//        moviesMap.put(1501, new Movie("Back to the Future", "Michael J. Fox"));
//        moviesMap.put(1884, new Movie("The Godfather", "Al Pacino"));
//        moviesMap.put(2932, new Movie("Casablanca", "Humphrey Bogart"));
//
//        for (Map.Entry<Integer, Movie> entry : moviesMap.entrySet()) {
//            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
//        }
//
//        System.out.println();
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