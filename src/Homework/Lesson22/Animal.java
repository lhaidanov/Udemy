/**
 * Created by Leonid Haidanov on 7/1/2021
 */

package Homework.Lesson22;

public class Animal {
    int eyes;

    public Animal() {
        System.out.println("I am Animal");
    }


    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    Pet() {
        System.out.println("I am Pet");
        eyes = 2;
    }

    String name;
    int tale = 1;
    int paw = 4;


    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    String a;

    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    String a;

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sunny");
        System.out.println("dog has " + d1.paw + " paw");
        Cat c1 = new Cat("Nora");
        c1.sleep();
    }
}