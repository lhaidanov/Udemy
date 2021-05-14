/**
 * Created by Leonid Haidanov on 5/14/2021
 */

package Homework.Lesson7_1;

import Homework.Lesson7.Employee;

public class CallEmployee {

    public static void main(String[] args) {
        Homework.Lesson7.Employee e2 = new Homework.Lesson7.Employee( "Petrov", 18,  "sales");
//        System.out.println("ID = " + e2.id); // id with default access level
        System.out.println("ID = " + e2.surname);
//        System.out.println("ID = " + e2.salary; // salary with private access level
        e2.ShowID();
        e2.ShowSurname();
        e2.ShowSalary();

    }
}
