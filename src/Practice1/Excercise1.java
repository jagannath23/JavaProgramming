package Practice1;

import java.util.Random;

/*
Declarar dos variables numéricas con cualquier valor, mostrar por consola
la suma, resta, multiplicación, división y módulo (resto de la división).
 */
public class Excercise1 {
    public static void main(String[] args) {
        int aNumber = new Random().nextInt(11);
        int otherNumber = new Random().nextInt(11);

        System.out.println(aNumber + " + " + otherNumber + " = " + (aNumber + otherNumber));
        System.out.println(aNumber + " - " + otherNumber + " = " + (aNumber - otherNumber));
        System.out.println(aNumber + " * " + otherNumber + " = " + (aNumber * otherNumber));
        System.out.println(aNumber + " / " + otherNumber + " = " + (aNumber / otherNumber));
        System.out.println(aNumber + " % " + otherNumber + " = " + (aNumber % otherNumber));
    }
}
