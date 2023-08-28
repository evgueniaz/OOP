package org.example;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal() {
    }

    protected void animalinfo() {
        System.out.println("Animals = " + name);
    }

    public void voice() {
        System.out.println("Animals = " + name + " produced a sound");
    }

    public void jump() {
        System.out.println("Animals = " + name + " jumped!");
    }
}
