/**
 * Created by Leonid Haidanov on 5/14/2021
 */

package Homework.Lesson6;

public class Summa {
//    double number1;
//    double number2;
//    double number3;
//    double number4;
//    double sum;
//
//   Summa(double n1, double n2, double n3, double n4) {
//        number1 = n1;
//        number2 = n2;
//        number3 = n3;
//        number4 = n4;
//    }
//
//    Summa(double n11, double n21, double n31) {
//        this(n11, n21, n31, 0.0);
//    }
//
//    Summa(double n12, double n22) {
//        this(n12, n22, 0.0, 0.0);
//    }
//
//    Summa(double n13) {
//        this(n13, 0.0, 0.0, 0.0);
//    }
//
//    Summa() {
//        this(0.0, 0.0, 0.0, 0.0);
//    }
//
    double sum(double n1, double n2, double n3, double n4) {
        double sum = n1 + n2 + n3 + n4;
        System.out.println("Sum of the numbers = " + sum);
        return sum;
    }

    double sum(double n1, double n2, double n3) {
        double sum = n1 + n2 + n3;
        System.out.println("Sum of the numbers = " + sum);
        return sum;
    }

    double sum(double m1, double m2) {
        double sum = m1 + m2 ;
        System.out.println("Sum of the numbers = " + sum);
        return sum;
    }

    double sum(double n1) {
        double sum = n1;
        System.out.println("Sum of the numbers = " + sum);
        return sum;
    }

    double sum() {
        double sum = 0.0;
        System.out.println("Sum of the numbers = " + sum);
        return sum;
    }
}

class SummaTest {
    public static void main(String[] args) {
        Summa s1 = new Summa();
        s1.sum();
        s1.sum(1);
        s1.sum(1,2,3);
        s1.sum(1,2);
        s1.sum(1,2,3);


    }
}