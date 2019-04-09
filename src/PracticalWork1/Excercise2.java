package PracticalWork1;

import java.util.Random;

// Write a program that declares variables of various types (int, double, float) and operate them arithmetically
public class Excercise2 {
    public static void main(String[] args) {
        int anIntNumber = new Random().nextInt(11);
        int otherIntNumber = new Random().nextInt(11);

        double aDoubleNumber = new Random().nextDouble();
        double otherDoubleNumber = new Random().nextDouble();

        float aFloatNumber = new Random().nextFloat();
        float otherFloatNumber = new Random().nextFloat();

        System.out.println(anIntNumber + " + " + otherIntNumber + " = " + (anIntNumber + otherIntNumber));
        System.out.println(anIntNumber + " - " + otherIntNumber + " = " + (anIntNumber - otherIntNumber));
        System.out.println(anIntNumber + " * " + otherIntNumber + " = " + (anIntNumber * otherIntNumber));
        System.out.println(anIntNumber + " / " + otherIntNumber + " = " + (anIntNumber / otherIntNumber));
        System.out.println(anIntNumber + " % " + otherIntNumber + " = " + (anIntNumber % otherIntNumber));

        System.out.println(aDoubleNumber + " + " + otherDoubleNumber + " = " + (aDoubleNumber + otherDoubleNumber));
        System.out.println(aDoubleNumber + " - " + otherDoubleNumber + " = " + (aDoubleNumber - otherDoubleNumber));
        System.out.println(aDoubleNumber + " * " + otherDoubleNumber + " = " + (aDoubleNumber * otherDoubleNumber));
        System.out.println(aDoubleNumber + " / " + otherDoubleNumber + " = " + (aDoubleNumber / otherDoubleNumber));
        System.out.println(aDoubleNumber + " % " + otherDoubleNumber + " = " + (aDoubleNumber % otherDoubleNumber));

        System.out.println(aFloatNumber + " + " + otherFloatNumber + " = " + (aFloatNumber + otherFloatNumber));
        System.out.println(aFloatNumber + " - " + otherFloatNumber + " = " + (aFloatNumber - otherFloatNumber));
        System.out.println(aFloatNumber + " * " + otherFloatNumber + " = " + (aFloatNumber * otherFloatNumber));
        System.out.println(aFloatNumber + " / " + otherFloatNumber + " = " + (aFloatNumber / otherFloatNumber));
        System.out.println(aFloatNumber + " % " + otherFloatNumber + " = " + (aFloatNumber % otherFloatNumber));
    }
}
