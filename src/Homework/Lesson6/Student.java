/**
 * Created by Leonid Haidanov on 5/10/2021
 */

package Homework.Lesson6;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    //score on a 10 point scale;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

    Student(int studentId1, String name1, String surname1, int course1, double mathAverageGrade1, double economicsAverageGrade1, double foreignLanguageAverageGrade1) {
        studentId = studentId1;
        name = name1;
        surname = surname1;
        course = course1;
        mathAverageGrade = mathAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade1;
    }

    Student(int studentId2, String name2, String surname2, int course2) {
        this (studentId2, name2, surname2, course2, 0.0, 0.0,0.0);
    }

    Student() {
        this (0, null, null, 0, 0.0, 0.0,0.0);
    }

}

class AverageGrade {
    double AverageGradeOfStudent(Student st) {
        double averageGrade = (st.economicsAverageGrade + st.foreignLanguageAverageGrade + st.mathAverageGrade) / 3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " " + st.surname + " = " + averageGrade);
        return averageGrade;
    }


}

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student(2,"Ivan", "Ivanov",3);
        Student st3 = new Student(3, "Petr", "Petrov", 5, 8,8,8);

        AverageGrade ag = new AverageGrade();
        ag.AverageGradeOfStudent(st1);
        ag.AverageGradeOfStudent(st2);
        ag.AverageGradeOfStudent(st3);

    }


}
