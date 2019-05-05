package practice1;

import java.util.Random;

/*
Declarar dos variables numéricas con cualquier valor, e indicar cuál es
mayor. Indicar también si son iguales.
 */
public class Excercise2 {
    public static void main(String[] args) {
        int aNumber = new Random().nextInt(11);
        int otherNumber = new Random().nextInt(11);

        System.out.println(aNumber +
                (aNumber > otherNumber ? " es mayor que "
                : aNumber < otherNumber ? " es menor que "
                : " es igual a ") + otherNumber);
    }
}
