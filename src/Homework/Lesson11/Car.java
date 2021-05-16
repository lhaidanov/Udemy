/**
 * Created by Leonid Haidanov on 5/15/2021
 */

package Homework.Lesson11;

public class Car {
    public String color;
    public String engine;
    public int numberOfDoors;

    Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

}

class CarTest {

    public static int changeNumberOfDoors(Car c1, int additionalDoors) {
        c1.numberOfDoors = c1.numberOfDoors + additionalDoors;
        return c1.numberOfDoors;
    }

    public static void swapColors(Car c1, Car c2) {
        String testColor = c1.color;
        c1.color = c2.color;
        c2.color = testColor;
    }
}

class Lesson11 {
    public static void main(String[] args) {
        Car car1 = new Car("blue", "V6", 2);
        Car car2 = new Car("red", "V8", 5);
        CarTest.changeNumberOfDoors(car1, 2);
        CarTest.swapColors(car1, car2);
        System.out.println("Info about Car 1 after upgrade: color is \"" + car1.color + "\", engine is \"" + car1.engine + "\", number of doors = " + car1.numberOfDoors + ".");
        System.out.println("Info about Car 2 after upgrade: color is \"" + car2.color + "\", engine is \"" + car2.engine + "\", number of doors = " + car2.numberOfDoors + ".");
    }
}

