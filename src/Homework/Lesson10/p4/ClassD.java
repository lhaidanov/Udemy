/**
 * Created by Leonid Haidanov on 5/15/2021
 */

package Homework.Lesson10.p4;

import Homework.Lesson10.p1.ClassA;
import Homework.Lesson10.p1.p2.ClassB;
import Homework.Lesson10.p1.p2.p3.ClassC;
import Homework.Lesson10.p4.p5.*;
import static Homework.Lesson10.p1.p2.ClassB.pi;

public class ClassD {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassC c = new ClassC();
        System.out.println("multiplication = " + ClassE.Multiplication(1, 2, 3));
        System.out.println();
        ClassE.Division(8, 5);
        System.out.println();
        System.out.println("–°ircumference = " + ClassB.–°ircumference(10));
        System.out.println();
        System.out.println("CircleArea = " + a.CircleArea(5));
        System.out.println();
        c.–°ircumferenceAndCircleArea(5);
        System.out.println();
        System.out.println("pi = "+ pi);
    }
}
