// Lesson19 >>
// * varargs
// * arguments with type command line
// * foreach

//NOTE!!! this file needs to be run from internal terminal not from IDEA

public class Lesson19 {
    public static String[] abc(String[]... array1) {
        int lenght = 0;

        for (String[] array2 : array1) {
            lenght += array2.length;
        }

        String[] target = new String[lenght];
        int count = 0;
        for (String[] array2 : array1) {
            for (String element : array2) {
                target[count] = element;
                count++;
            }

        }
        return target;

    }

    public static void main(String[] args) {
        String[] targetArray1 = {"test11", "test12", "test13"};
        String[] targetArray2 = {"test21", "test22"};
        String[] target = abc(targetArray1, targetArray2);

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }

        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
