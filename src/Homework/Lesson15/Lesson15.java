/**
 * Created by Leonid Haidanov on 5/31/2021
 */

// Lesson 15 >> loops while and do while

package Homework.Lesson15;

public class Lesson15 {

    public static void PrintTime() {
        int h = 0;




        OUTER:
        while (h < 6) {
            int m = -1;
            MIDDLE:
            do {
                m++;
                if ( (h > 1) && (m % 10 == 0)) {
                    System.out.println("test");
                    break OUTER;

                }

                int s = 0;
                INNER:
                while (s < 60) {
                    if ((s * h) > m) {
                        continue MIDDLE;
                    }

                    System.out.println(h + ":" + m + ":" + s);
                    s++;
                }

            } while (m < 59);
            h++;
        }


    }

    public static void main(String[] args) {
        PrintTime();
    }
}
