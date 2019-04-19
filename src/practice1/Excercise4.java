package practice1;

import java.util.Random;

/*
Crear una variable numérica con cualquier valor, he indicar si está entre 0 y 10.
 */
public class Excercise4 {
    public static void main(String[] args) {
        int number = new Random().nextInt(21);

        System.out.println(number +
                (number > 0 && number < 10 ?
                " está entre 0 y 10"
                : " no está entre 0 y 10"));
    }
}
