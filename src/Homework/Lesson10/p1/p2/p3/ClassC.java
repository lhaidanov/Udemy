/**
 * Created by Leonid Haidanov on 5/15/2021
 */

package Homework.Lesson10.p1.p2.p3;

import static Homework.Lesson10.p1.ClassA.CircleArea;
import static Homework.Lesson10.p1.p2.ClassB.Сircumference;

public class ClassC {

    public void СircumferenceAndCircleArea(double r2) {
        System.out.println("radius = " + r2);
        System.out.println("circumference = " + Сircumference(r2));
        System.out.println("area of a circle = " + CircleArea(r2));
    }
}
