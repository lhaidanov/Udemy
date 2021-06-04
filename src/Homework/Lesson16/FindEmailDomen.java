/**
 * Created by Leonid Haidanov on 6/4/2021
 */
// Lesson 16 >> String and string methods


package Homework.Lesson16;

public class FindEmailDomen {


    public static void email(String s1) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s1.length() - 1) {

            a = s1.indexOf('@', c);
            b = s1.indexOf('.', c);
            c = s1.indexOf(';', c + 1);

            System.out.println(s1.substring(a + 1, b));
        }

    }

    public static void main(String[] args) {

        email("test@mail.com;  test@gml1.com; sdfjkfsd$@test.;");
    }
}


