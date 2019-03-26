package Practice1;

import java.util.Scanner;

/*
Declarar un String que contenga un nombre y mostrar un mensaje de
bienvenida por consola. Por ejemplo, si se introduce Jhon Jenkins,
que aparezca "Querido Jhon Jenkins, bienvenido a Java!".
 */
public class Excercise3 {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");

        String name = nameScanner.nextLine();
        System.out.println("Querido " + name + ", bienvenido a Java!");
    }
}
