/**
 * Created by Leonid Haidanov on 10/25/2021
 */

package Homework.Lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson28 {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2021, 01, 01, 16, 40);
        LocalDateTime ldt2 = LocalDateTime.of(2021, 10, 5, 16, 40);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofHours(2);
        Lesson28 l = new Lesson28();
        l.smena(ldt, ldt2, p, d);

    }

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.print("Работаем с: " + ldt.format(f1));
            ldt = ldt.plus(p);
            System.out.println(" До: " + ldt.format(f1));
            System.out.print("Отдыхаем с: " + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println(" До: " + ldt.format(f2));
            System.out.println();
        }
    }
}
