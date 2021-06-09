package Homework.Lesson18;

public class PrintArray {
    public static void showArray(String[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ",");
                } else System.out.print(array[i][j]);
            }
            if (i != array.length - 1) {
                System.out.print("},");
            } else System.out.print("}");
        }
        System.out.print("}");

    }

    public static void main(String[] args) {
        String[][] array1 = {{"test1.1", "test1.2","test1.3","test1.4"}, {"test2.1"}, {"test3.1", "test3.2", "test3.3"}};
        showArray(array1);
    }
}
