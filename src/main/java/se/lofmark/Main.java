package se.lofmark;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person Albin = new Person(1, "Albin", "Löfmark", "albinlofmark01@gmail.com");
        System.out.println(Albin.getSummary());

        TodoItem book = new TodoItem(1, "Write a book",
                "Write a book about whales that contains 30 pages",
                LocalDate.of(2025, 7, 24), true, Albin);
        System.out.println(book.getSummary());
    }
}