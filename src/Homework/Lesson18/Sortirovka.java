/**
 * Created by Leonid Haidanov on 6/8/2021
 */
// Lesson 18 >> Arrays


package Homework.Lesson18;

public class Sortirovka {
    public static void sortirovka(int[] array) {
        int a;
        for (int j = 0; j < array.length; j++) {
            int min = array[j];
            int index= j;
            for (int i = j+1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index =i;
                }

                System.out.print(array[i] + " ");
            }
        }


    }

    public static void main(String[] args) {
        int[] array1 = {6, 3, 1, 6};
        sortirovka(array1);
    }

}
