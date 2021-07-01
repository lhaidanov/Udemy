/**
 * Created by Leonid Haidanov on 7/1/2021
 */

package Homework.Lesson22;

public class Animal {
    private int eyes;

    Animal() {
        System.out.println("I am Animal");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        if (eyes > 0) {
            this.eyes = eyes;
        }
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    private String name;
    private int tale = 1;
    private int paw = 4;


    Pet() {
        System.out.println("I am Pet");
        setEyes(2);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTale() {
        return tale;
    }

    public void setTale(int tale) {
        this.tale = tale;
    }

    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{

    String a;

    Dog(){
        System.out.println("I am dog and my name is " + setName());
    }

}
