package practice1;

import java.util.Random;

/*
A IterationInstructions añadirle si la variable está entre 11 y 20, o entre 21 y 30.
 */
public class Excercise5 {
    public static void main(String[] args) {
        int number = new Random().nextInt(41);

        System.out.println(number
                + ((number > 0 && number < 10) ? " está entre 0 y 10"
                : (number > 10 && number < 20) ? " está entre 10 y 20"
                : (number > 20 && number < 30) ? " está entre 20 y 30"
                : " no está entre 0 y 30"));
    }
}
