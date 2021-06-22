/**
 * Created by Leonid Haidanov on 6/10/2021
 */

package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {
    public ArrayList<String> abc(String... array1) {
        ArrayList<String> aList1 = new ArrayList<>();
        for (String s : array1) {
            if (!aList1.contains(s)) {
                aList1.add(s);
            }
        }
        Collections.sort(aList1);
        System.out.println(aList1);
        return aList1;
    }

    public static void main(String[] args) {
        Lesson20 l20 =  new Lesson20();
        l20.abc("test1", "test2", "test5", "test4", "test2");
    }
}
