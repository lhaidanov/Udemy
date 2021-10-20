package Homework.Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Karl_1");
        Animal a2 = new Lev("simba_1");
        Animal a3 = new Pingvin("Kovalski_1");
        Fish f1 = new Mechenosec("Karl_2");
        Birds b1 = new Pingvin("Kovalski_2");
        Mammal mam1 = new Lev("simba_2");
        Mechenosec mech1 = new Mechenosec("Karl_3");
        Pingvin p1 = new Pingvin("Kovalski_3");
        Lev l1 = new Lev("simba_3");
        Speakable s1 = new Lev("simba_4");
        Speakable s2 = new Pingvin("Kovalski_4");
        Animal[] array1 = {a1, a2, a3, f1, b1, mam1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, mam1, p1, l1};

        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("------------------------------------");
        }


        for (Speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("------------------------------------");
        }


//        Mechenosec mch = new Mechenosec("Karl");
//        System.out.println(mch.name);
//        mch.eat();
//        mch.sleep();
//        mch.swim();
//        System.out.println();
//        Speakable s = new Pingvin("kovalsky");
//        s.speak();
//        Animal a = new Lev("simba");
//        System.out.println();
//        System.out.println(a.name);
//        a.eat();
//        a.sleep();
//        Mammal mam = new Lev("simba2");
//        System.out.println();
//        System.out.println(mam.name);
//        mam.run();
//        mam.eat();
//        mam.sleep();
//        mam.speak();
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
        System.out.println("Lev eto ne samaya bistraya koshka");
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