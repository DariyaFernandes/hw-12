package com.Main;


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



    }



