/**
 * Created by Leonid Haidanov on 5/18/2021
 */
// Lesson 14 >> loops, regular "for", using break and continue, nested loops, unreachable statement, loops labels

package Homework.Lesson14;

public class Lesson14 {
    public static void PrintTime() {

        OUTER:
        for (int h = 0; h <= 6; h++) {
            MIDDLE:
            for (int m = 0; m < 60; m++) {
                if (h > 1 && m % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int s = 0; s < 60; s++) {
                    if (s * h > m) {
                        continue MIDDLE;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }


    }

    public static void main(String[] args) {
        PrintTime();
    }
}
