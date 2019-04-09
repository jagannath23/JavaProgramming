package PracticalWork1;

import java.util.Random;

/*
Write a program that implements the same link with For and with While.
Pseudocode FOR (nested):
    Declare var1 = 0 and var2 = 0 as integers (or another type) ..
    First for loop for var1: Increase it 10 times and show the value of var1 on the screen.
    Second loop for for var1: Decrement it 10 times and show the value of var2 on the screen.
    Third loop: nest both loops and show values ​​on the screen.
Pseudocode WHILE
    Declare var1 = 5 and var2 = -20 as integers (or another type).
    While var1 is different to var2, Go decreasing var1 and increasing var2 in each cycle. When they are the same,
    print on the screen "THEY WERE EQUALIZED IN THE CYCLE:" + cycle.
*/
public class Excercise4 {
    public static void main(String[] args) {
        int var1 = 0;
        int var2 = 0;

        for (int i = 0; i < 10; i++) {
            var1++;
        }
        System.out.println("var1: " + var1);
        var1 = 0;
        while (var1 != 10) {
            var1++;
        }
        System.out.println("var1: " + var1);

        for (int i = 0; i < 10; i++) {
            var2--;
        }
        System.out.println("var2: " + var2);
        var2 = 0;
        while (var2 != -10) {
            var2--;
        }
        System.out.println("var2: " + var2);

        var1 = 5;
        var2 = -5;
        int cycle = 0;

        while (var2 != var1) {
            var1--;
            var2++;
            cycle++;
        }
        System.out.println("var1 y var2 were equalized in the cycle: " + cycle);
    }
}
