package com.Main;


import java.util.Objects;

public class Author {
    private String name;

    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println("Создан автор " + name + " " + surname);

    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (!Objects.equals(name, author.name)) return false;
        return Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }



    }



