package org.example;

public class Owner {

    private static String name; // Приватное поле name

    Owner(String name) {
        Owner.name = name;
    }

    public static void myName() {
        System.out.println("Мой владелец - " + name + ".");
    }
}
