/**
 * Created by Leonid Haidanov on 6/8/2021
 */
// Lesson 18 >> Arrays


package Homework.Lesson18;

public class Sortirovka {
    public static int[] sortirovka(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int a;
            int minElement = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minElement) {
                    minElement = array[j];
                    index = j;
                }
            }

            if (i != index) {
                a = array[i];
                array[i] = minElement;
                array[index] = a;
            }

        }
        return array;


    }

    public static void main(String[] args) {
        int[] array1 = {1, 0, 9, 2};
        sortirovka(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

}
