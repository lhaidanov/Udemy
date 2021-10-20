/**
 * Created by Leonid Haidanov on 7/7/2021
 */

package Homework.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mch = new Mechenosec("Karl");
        System.out.println(mch.name);
        mch.eat();
        mch.sleep();
        mch.swim();
        System.out.println();
        Speakable s = new Pingvin("kovalsky");
        s.speak();
        Animal a = new Lev("simba");
        System.out.println();
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("simba2");
        System.out.println();
        System.out.println(mam.name);
        mam.run();
        mam.eat();
        mam.sleep();
        mam.speak();
    }
}

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda interestno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Birds extends Animal implements Speakable {
    Birds(String name) {
        super(name);
        this.name = name;
    }


    public void speak() {
        System.out.println(name + "sings");
    }

    ;

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    public void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obichniy ribiy korm!");
    }
}

class Pingvin extends Birds {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Pingvivi spyat prizavshis drug k drugu!");
    }

    public void fly() {
        System.out.println("Pingvivi ne umeyut letat!");
    }

    public void eat() {
        System.out.println("Pingvin lubit est ribu");
    }

    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit");
    }

    public void run() {
        System.out.println("Lev eto ne samays bistraya koshka");
    }

    public void eat() {
        System.out.println("Lev kak luboy hishnik lubit myaso");
    }
}


interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}