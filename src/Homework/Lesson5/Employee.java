/**
 * Created by Leonid Haidanov on 5/10/2021
 */

package Homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id2,    String surname2, int age2, double salary2, String department2 ){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double SalaryDoubled () {
        double doubleSalary = salary * 2;
        System.out.println(surname + "\'s salary was $" + salary + " and now it\'s doubled and = $" + doubleSalary);
        return doubleSalary;
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ivanov",  24, 12_000, "manager");
        Employee e2 = new Employee(2, "Petrov",  18, 5_000, "sales");
        e1.SalaryDoubled();
        e2.SalaryDoubled();
    }
}