package org.example;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ginger", "red", 5);
//        cat1.name = "Ginger";
//        cat1.color = "red";
        cat1.setAge(-5);
        System.out.println("cat1 = " + cat1);


        Vector vector1 = new Vector(1, 0, 1);
        Vector vector2 = new Vector(1, 0, 1);
        vector1.length();
        System.out.println("vector.length() = " + vector1.length() );
        System.out.println("vector1.scal(vector2) = " + vector1.scal(vector2));
        System.out.println("vector1.vprod(vector2) = " + vector1.vprod(vector2));
        System.out.println("vector1.vangle(vector2) = " + vector1.vangle(vector2));

        Animal animal = new Animal();
        animal.animalinfo();
        animal.voice();
        animal.jump();
        cat1.animalinfo();
    }
}