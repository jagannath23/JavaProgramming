package PracticalWork1;

import java.util.Random;

/*
Write a program that uses the IF-ELSE statements.
        Pseudocode to be implemented in java:
        Declare var1 and var2 as integers and assign value to them.
        Work with comparison operators to determine:
        If var1 is equal to var2, print on the screen "ARE EQUAL";
        Otherwise, if var1 is different from var2:
        - If var1 is greater than var2, then print on the screen "VAR1 GREATER TO VAR2";
        - But, if var1 is less than var2, then print on the screen "VAR1 LESS TO VAR2";
*/
public class Excercise3 {
    public static void main(String[] args) {
        int var1 = new Random().nextInt();
        int var2 = new Random().nextInt();

        if (var1 == var2) {
            System.out.println("var1: " + var1 + " and var2: " + var2 + "are equal");
        } else {
            if (var1 > var2) {
                System.out.println("var1: " + var1 + " is greater than var2: " + var2);
            } else {
                System.out.println("var1: " + var1 + " is less than var2: " + var2);
            }
        }
    }
}
