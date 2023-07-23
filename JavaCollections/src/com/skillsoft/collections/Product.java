package com.skillsoft.collections;

import java.util.Objects;

//public class Product implements Comparable<Product> {
public class Product {

    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("\n{name=%s, category=%s}", name, category);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if(!(other instanceof Product)) {
            return false;
        }

        Product otherProduct = (Product) other;

        if (otherProduct.name.equals(this.name)  &&
                otherProduct.category.equals(this.category)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

//    @Override
//    public int compareTo(Product o) {
//
//        int compareName = this.name.compareTo(o.name);
//
//        if (compareName != 0) {
//            return compareName;
//        }
//
//        return this.category.compareTo(o.category);
//    }
}
