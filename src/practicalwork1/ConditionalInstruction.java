package practicalwork1;

import java.util.Random;

/* Exercise 3
Write a program that uses the IF-ELSE statements.
        Declare var1 and var2 as integers and assign value to them.
        Work with comparison operators to determine:
        If var1 is equal to var2, print on the screen "ARE EQUAL";
        Otherwise, if var1 is different from var2:
        - If var1 is greater than var2, then print on the screen "VAR1 GREATER TO VAR2";
        - But, if var1 is less than var2, then print on the screen "VAR1 LESS TO VAR2";
*/
public class ConditionalInstruction {
    public static void main(String[] args) {
        int var1 = new Random().nextInt();
        int var2 = new Random().nextInt();

        System.out.println(var1 +
                (var1 > var2 ? " is greater than "
                : var1 < var2 ? " is less than "
                : " is equal to") + var2);
    }
}
