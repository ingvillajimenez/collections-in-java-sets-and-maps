package com.skillsoft.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> carSet = new HashSet<>();

        carSet.add("Volvo");
        carSet.add("BMW");
        carSet.add("Ford");
        carSet.add("Honda");
        carSet.add("Toyota");
        carSet.add("Chevrolet");

        System.out.println("Car set original contents: " + carSet);

        System.out.println();

        System.out.println("********** Can remove elements from sets");

        carSet.remove("Volvo");
        System.out.println("Car set contents: " + carSet);

        carSet.remove("Toyota");
        System.out.println("Car set contents: " + carSet);

        System.out.println();

        Set<String> bikeSet = new HashSet<>();

        bikeSet.add("Yamaha");
        bikeSet.add("Suzuki");
        bikeSet.add("Honda");
        bikeSet.add("BMW");

        System.out.println("Bike set original contents: " + bikeSet);

        System.out.println();

        System.out.println("******* Union operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.addAll(bikeSet);

        System.out.println("carSet union bikeSet: " + carSet);

        System.out.println();

        System.out.println("********* Intersection operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.retainAll(bikeSet);

        System.out.println("carSet intersection bikeSet: " + carSet);

        System.out.println();

        System.out.println("********* Difference operation");
        System.out.println("Car set original contents: " + carSet);
        System.out.println("Bike set original contents: " + bikeSet);

        carSet.removeAll(bikeSet);

        System.out.println("carSet difference bikeSet: " + carSet);

        System.out.println();

//        HashSet<String> hashSet = new HashSet<>();
//
//        System.out.println("hashSet instanceof HashSet: " + (hashSet instanceof HashSet));
//        System.out.println("hashSet instanceof Set: " + (hashSet instanceof Set));
//        System.out.println("hashSet instanceof Collection: " + (hashSet instanceof Collection));
//        System.out.println("hashSet instanceof Iterable: " + (hashSet instanceof Iterable));

//        HashSet<String> carSet = new HashSet<>();
//
//        carSet.add("Volvo");
//        carSet.add("BMW");
//        carSet.add("Ford");
//        carSet.add("Mazda");
//
//        System.out.println("Cars set: " + carSet);
//
//        System.out.println();
//
//        System.out.println("********** Duplicates are not allowed in sets");
//
//        carSet.add("BMW");
//        carSet.add("Ford");
//
//        System.out.println("Cars set: " + carSet);
//
//        System.out.println();
//
//        System.out.println("********** Null values are allowed");
//
//        carSet.add(null);
//        carSet.add(null);
//        carSet.add(null);
//
//        System.out.println("Cars set: " + carSet);
//
//        System.out.println();

    }
}

// Sets
// Unordered collection of elements which do not allow duplicates

// Equality checks
// Performed using the .equals() and .hashCode() method on objects