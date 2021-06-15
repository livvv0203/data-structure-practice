package com.jieqing;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return String.format("name = %-9s age = %-5d", name, age);
    }
}












