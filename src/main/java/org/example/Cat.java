package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cat extends Animal{
//    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void animalinfo() {
        System.out.println("Cat: " + super.name +
                " of color: " + color +
                " of an age of " + age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    public Cat(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//
//    public Cat() {
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age < 0) {
//            throw new IllegalArgumentException();
//        }
//        this.age = age;
//    }
}

