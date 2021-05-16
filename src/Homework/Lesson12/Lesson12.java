/**
 * Created by Leonid Haidanov on 5/16/2021
 */
//Lessen 12 >>  "if" and "if else"

package Homework.Lesson12;


public class Lesson12 {

    public static void ifStudentIsTheSame(Student st1, Student st2) {

        if (st1.studentId == st2.studentId && st1.name.equals(st2.name) && st1.course == st2.course) {
            System.out.println("it's the same student");
        } else {
            System.out.println("It's different students");
        }

    }
    // find FIRST difference between students
    public static void ifParametersOfStudentsIsTheSame(Student st1, Student st2) {

        if (st1.studentId == st2.studentId) {
            if (st1.name.equals(st2.name)) {
                if (st1.course == st2.course) {
                    System.out.println("ID, Name and course equals");
                } else {
                    System.out.println("ID and Name is the same, but student's course is different");
                }
            } else {
                System.out.println("ID is the same, but student's Name is different");
            }
        } else {
            System.out.println("student's ID is different ");
        }
    }
}

class Lesson12Test {

    public static void main(String[] args) {
        Student st1 = new Student(2, "Ivan", 2);
        Student st2 = new Student(2, "Ivan", 2);
        Lesson12.ifStudentIsTheSame(st1, st2);
        Lesson12.ifParametersOfStudentsIsTheSame(st1, st2);
    }
}
