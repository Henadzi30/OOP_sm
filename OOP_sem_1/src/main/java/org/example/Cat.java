package org.example;


public class Cat {
    private String name; // Приватное поле name
    private int age; // Приватное поле age

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return this.name;
    }

    public Integer getAge() { return this.age; }

    private void haveGreet() { // Приватный метод greet()

        System.out.print("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). ");
        Owner.myName();
    }

    public void greet() { // Публичный метод greet()
        haveGreet(); // Вызов приватного метода haveGreet()
    }
}
