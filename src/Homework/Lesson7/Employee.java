/**
 * Created by Leonid Haidanov on 5/10/2021
 */

//Lessen 7 >>  Packages and access modifiers

package Homework.Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    // Create 3 constructors with different access modifier
     private Employee (int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    Employee( int id3, String surname3, int age3, String department3) {
        this(id3, surname3, age3, 0.0, department3);
    }

    public Employee(String surname4, int age4,  String department4) {
        this(0, surname4, age4, 0.0, department4);
    }


//    double SalaryDoubled() {
//        double doubleSalary = salary * 2;
//        System.out.println(surname + "\'s salary was $" + salary + " and now it\'s doubled and = $" + doubleSalary);
//        return doubleSalary;
//    }


    // Create 3 public methods to display value of var's
    public int ShowID() {
        System.out.println("ID = " + id);
        return id;
    }

    public String ShowSurname() {
        System.out.println("Surname = " + surname);
        return surname;
    }

    public double ShowSalary() {
        System.out.println("Salary = " + salary);
        return salary;
    }


}

class EmployeeTest {

    public static void main(String[] args) {

//        Employee e1 = new  Employee(1, "Ivanov", 24,12_00,  "manager");
        Employee e1 = new  Employee(1, "Ivanov", 24,  "manager");
        e1.ShowSalary();
        e1.ShowID();
        e1.ShowSurname();

    }
}