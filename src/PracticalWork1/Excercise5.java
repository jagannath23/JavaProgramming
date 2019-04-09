package PracticalWork1;

import java.util.Random;

// Write a program that implements the Fibonacci series
public class Excercise5 {
    public static void main(String[] args) {
        int iterations = new Random().nextInt(25);
        int fibo = 0;
        int nacci = 1;

        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < iterations; i++) {
            fibo += nacci;
            nacci = fibo - nacci;
            System.out.print(" " + nacci);
        }
    }
}
