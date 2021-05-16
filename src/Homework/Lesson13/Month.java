/**
 * Created by Leonid Haidanov on 5/16/2021
 */

//Lessen 13 >>  construction Switch

package Homework.Lesson13;

public class Month {

    public static int NumberOfDays(int d) {
        switch (d) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("number of days in the month is 31");
                break;
            case 2:
                System.out.println("number of days in the month is 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("number of days in the month is 30");
                break;
            default:
                System.out.println("incorrect number of month");

        }
        return d;
    }

    public static void main(String[] args) {
        NumberOfDays(6);

    }
}
