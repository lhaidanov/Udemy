/**
 * Created by Leonid Haidanov on 6/4/2021
 */
// Lesson 17 >> StringBuilder
package Homework.Lesson17;

public class Lesson17 {

    public static boolean stringBuildersAreEqual(StringBuilder value1, StringBuilder value2) {
        boolean result = true;
        if (value1.length() == value2.length()) {
            for (int i = 0; i < value1.length(); i++) {
                if (value1.charAt(i) != value2.charAt(i)) {
                    result = false;
                    break;

                }
            }
        } else {
            result = false;
        }
        return result;

    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder("test");
        StringBuilder sb3 = sb1;
        StringBuilder sb4 = new StringBuilder("test1");

        System.out.println(stringBuildersAreEqual(sb1, sb2));
        System.out.println(stringBuildersAreEqual(sb1, sb3));
        System.out.println(stringBuildersAreEqual(sb1, sb4));
        System.out.println(stringBuildersAreEqual(new StringBuilder(), new StringBuilder()));
        System.out.println(stringBuildersAreEqual(new StringBuilder(""), new StringBuilder("")));
        System.out.println(stringBuildersAreEqual(new StringBuilder("test"), new StringBuilder("Test")));
    }


}
