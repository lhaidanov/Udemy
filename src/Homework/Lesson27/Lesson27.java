/**
 * Created by Leonid Haidanov on 10/24/2021
 */
package Homework.Lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        try {
            tiger.eat("salad");
        } catch (NeMyasoExeption e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaExeption ex) {
                System.out.println(ex.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finnaly block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class NeMyasoExeption extends RuntimeException {
    NeMyasoExeption(String str) {
        super(str);
    }
}

class NeVodaExeption extends Exception {
    NeVodaExeption(String str) {
        super(str);
    }
}

class Tiger {
    public void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoExeption("Tigr ne est edu: " + eda);
        }
        System.out.println("Tigr est edu: " + eda);

    }

    public void drink(String jidkost) throws NeVodaExeption {
        if (!jidkost.equals("voda")) {
            throw new NeVodaExeption("Tigr ne pyet jidkost: " + jidkost);
        }
        System.out.println("Tigr pyet jidkost:" + jidkost);
    }
}