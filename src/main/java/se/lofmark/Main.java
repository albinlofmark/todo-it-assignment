package se.lofmark;

public class Main {
    public static void main(String[] args) {

        Person Albin = new Person(42, "Albin", "Löfmark", "albinlofmark01@gmail.com");
        System.out.println(Albin.getSummary());
    }
}