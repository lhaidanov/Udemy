/**
 * Created by Leonid Haidanov on 10/26/2021
 */

package Homework.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lesson29 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee("Ivan", "IT", 2_000);
        Employee employee2 = new Employee("Egor", "IT", 3_000);
        Employee employee3 = new Employee("Fedor", "Sales", 1_000);
        Employee employee4 = new Employee("Eva", "Eva", 2_00);
        Employee employee5 = new Employee("Vika", "Eva", 10_000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.filteringEmployee(list, emp -> emp.department == "IT" && emp.salary >200);
        System.out.println("__________________________________");
        employeeInfo.filteringEmployee(list, emp -> emp.name.startsWith("E") && emp.salary !=3_000);
        System.out.println("__________________________________");
        employeeInfo.filteringEmployee(list, emp -> !emp.name.equals(emp.department));

    }
}

class Employee {
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeInfo {
    void printEmployee(Employee emp) {
        System.out.println("Employee name: " + emp.name + ", Employee department: " + emp.department + ", salary: " + emp.salary + ".");
    }

    void filteringEmployee(ArrayList<Employee> aL, Predicate<Employee> e) {
        for (Employee employee1 : aL) {
            if (e.test(employee1)) {
                printEmployee(employee1);
            }
        }
    }

}
