/**
 * Created by Leonid Haidanov on 5/15/2021
 */

package Homework.Lesson9;

class Lesson9_1 {
    int a = 1;

    //    static int a =2;
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Lesson9_1 l9 = new Lesson9_1();
        l9.abc(3);
    }
}


class Lesson9_2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Lesson9_2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}


class Lesson9_3 {
    int a = 1;
    static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Lesson9_3.b);
    }

    public static void main(String[] args) {
        Lesson9_3 l9 = new Lesson9_3();
        l9.abc(4);
    }
}