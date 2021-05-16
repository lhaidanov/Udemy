/**
 * Created by Leonid Haidanov on 5/10/2021
 */
//Lessen 4 >>  Object and reference data type


package Homework.Lesson4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;

    //score on a 10 point scale;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
//
//    void AverageGrade(double lesson1, double lesson2, double lesson3 ) {
//        double averageGrade = (lesson1 + lesson2 + lesson3)/3;
//        System.out.println("Средняя арифметическая оценка студента " + name + " "+ surname + " = " + averageGrade);

}

class AverageGrade {
    void AverageGradeOfStudent (Student st) {
        double averageGrade = (st.economicsAverageGrade + st.foreignLanguageAverageGrade + st.mathAverageGrade)/3;
        System.out.println("Средняя арифметическая оценка студента " + st.name + " "+ st.surname + " = " + averageGrade);
//        return averageGrade; // if use 'AverageGradeOfStudent' as a double needs to return
}


}
class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 5;
        st1.foreignLanguageAverageGrade = 10;
        st1.economicsAverageGrade = 15;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Petr";
        st2.surname = "Petrov";
        st2.course = 1;
        st2.mathAverageGrade = 7;
        st2.foreignLanguageAverageGrade = 2;
        st2.economicsAverageGrade = 8.8;


        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Sidor";
        st3.surname = "Sidorov";
        st3.course = 4;
        st3.mathAverageGrade = 9;
        st3.foreignLanguageAverageGrade = 9;
        st3.economicsAverageGrade = 9;

        AverageGrade ag = new AverageGrade();
        ag.AverageGradeOfStudent(st1);
        ag.AverageGradeOfStudent(st2);
        ag.AverageGradeOfStudent(st3);

//        st1.AverageGrade(st1.mathAverageGrade, st1.economicsAverageGrade, st1.foreignLanguageAverageGrade);
//        st2.AverageGrade(st2.mathAverageGrade, st2.economicsAverageGrade, st2.foreignLanguageAverageGrade);
//        st3.AverageGrade(st3.mathAverageGrade, st3.economicsAverageGrade, st3.foreignLanguageAverageGrade);

    }


}
