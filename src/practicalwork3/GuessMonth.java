package practicalwork3;

import java.util.Random;
import java.util.Scanner;

public class GuessMonth {
    public static void main(String[] args) {
        String[] months = {
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december",
        };
        String secret_month = months[new Random().nextInt(12)];
        String user_month;
        boolean is_correct = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("what month am I thinking?");

        while (!is_correct) {
            user_month = scanner.nextLine();

            is_correct = user_month.equalsIgnoreCase(secret_month);

            System.out.println(user_month +
                    (is_correct ? " is the right one "
                            : " isn't the right one :(\n try it again "));
        }
    }
}
