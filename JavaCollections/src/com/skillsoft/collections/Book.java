package com.skillsoft.collections;
import java.util.Objects;

public class Book implements Comparable<Book> {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + author + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Book)) {
            return false;
        }

        Book otherBook = (Book) other;

        if (otherBook.name.equals(this.name) &&
                otherBook.author.equals(this.author)) {
            return true;
        }

        return false;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

}
