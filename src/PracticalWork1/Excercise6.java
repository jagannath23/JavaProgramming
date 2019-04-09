package PracticalWork1;

import java.util.Arrays;
import java.util.Random;

// Write a program from Excercise5 that stores the results of the series in an array of numbers
public class Excercise6 {
    public static void main(String[] args) {
        int iterations = new Random().nextInt(25);
        int fibo = 0;
        int nacci = 1;
        int[] fibonacci = new int[iterations];

        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < iterations; i++) {
            fibo += nacci;
            nacci = fibo - nacci;
            fibonacci[i] = nacci;
        }
        System.out.print(Arrays.toString(fibonacci));
    }
}
