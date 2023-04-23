package com.Author;

import com.Main.Author;

import java.util.Objects;

public class Book {
    private String name;


    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;

    }
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (year != book.year) return false;
        if (!Objects.equals(name, book.name)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
