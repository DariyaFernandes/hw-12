package com.pro;


import com.Author.Book;
import com.Main.Author;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Alexandr" , "Pushkin");
        Author bulgakov = new Author("Mikhail" , " Bulgakov");
        Book ryslanILydmila = new Book("Ryslan I Lydmila" , pushkin, 1987);
        Book masterIMargarita = new Book("Master I Margarita" , bulgakov , 1940);

        System.out.println("ryslanILydmila:");
        System.out.println(ryslanILydmila.getName());
        System.out.println(ryslanILydmila.getAuthor().getName() + "" + ryslanILydmila.getAuthor().getSurname());
        System.out.println(ryslanILydmila.getYear());
        System.out.println();

        System.out.println("masterIMargarita:");
        System.out.println(masterIMargarita.getName());
        System.out.println(masterIMargarita.getAuthor().getName() + "" + masterIMargarita.getAuthor().getSurname());
        System.out.println(masterIMargarita.getYear());

        ryslanILydmila.setYear(2000);
        System.out.println("Год издания ryslanILydmila " + ryslanILydmila.getYear());

        masterIMargarita.setYear(2005);
        System.out.println("Год издания masterIMargarita " + masterIMargarita.getYear());



    }
}