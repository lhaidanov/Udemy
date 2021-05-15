/**
 * Created by Leonid Haidanov on 5/15/2021
 */

package Homework.Lesson8;


public class Lesson8 {

    public static final double p = 3.14;

    public double CircleArea(double r) {
        return p * r * r;
    }

    public static double Сircumference(double r1) {
        return 2 * p * r1;
    }

    public void СircumferenceAndCircleArea(double r2) {
        System.out.println("radius = " + r2);
        System.out.println("circumference = " + Сircumference(r2));
        System.out.println("area of a circle = " + CircleArea(r2));
    }

    static double Multiplication(double a, double b, double c) {
        return a * b * c;
    }

    static void Division(int a1, int b1) {
        System.out.println("division " + a1 + " and " + b1 + " = " + a1 / b1);
        System.out.println("modulus " + a1 + " and " + b1 + " = " + a1 % b1);
    }
}

class Lesson8Test {

    public static void main(String[] args) {
        Lesson8 l8 = new Lesson8();
        System.out.println("multiplication = " + Lesson8.Multiplication(1, 2, 3));
        Lesson8.Division(8, 5);
        System.out.println("Сircumference = " + Lesson8.Сircumference(5));
        System.out.println("CircleArea = " + l8.CircleArea(5));
        l8.СircumferenceAndCircleArea(5);
    }
}
