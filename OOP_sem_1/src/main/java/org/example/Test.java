package org.example;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5); // Создание объекта класса Cat с именем "Barsik" и возрастом 5
        Owner owner = new Owner("Henadzi");  // Создание объекта класса Owner с именем "Henadzi"

        cat.greet(); // Вызов публичного метода greet(), который выведет сообщение
    }
}

