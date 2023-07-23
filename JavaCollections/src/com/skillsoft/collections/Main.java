package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Comparator<String> descendingOrderComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        String[] carsArray = new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};
        SortedSet<String> treeSet = new TreeSet<>(descendingOrderComparator);

        treeSet.addAll(Arrays.asList(carsArray));

        for (String name : treeSet) {
            System.out.println(name);
        }

//        Comparator<Product> productComparator = new Comparator<Product>() {
//
//            @Override
//            public int compare(Product o1, Product o2) {
//                int compareName = o1.getName().compareTo(o2.getName());
//
//                if (compareName != 0) {
//                    return compareName;
//                }
//
//                return o1.getCategory().compareTo(o2.getCategory());
//            }
//        };
//
////        SortedSet<Product> productSet = new TreeSet<>();
//        SortedSet<Product> productSet = new TreeSet<>(productComparator); // TreeSet uses Comparator interface to compare Product
//
//        Product phone = new Product("iPhone", "Mobiles");
//        Product tv = new Product("Samsung", "Electronics");
//        Product jeans = new Product("Levis", "Apparel");
//        Product watch = new Product("Rolex", "Accessories");
//
//        productSet.add(phone); // java.lang.ClassCastException because Product does not implement Comparable interface
//                            // com.skillsoft.collections.Product cannot be cast to class java.lang.Comparable
//        productSet.add(tv);
//        productSet.add(jeans);
//        productSet.add(watch);
//
//        for (Product product : productSet) {
//            System.out.println(product);
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