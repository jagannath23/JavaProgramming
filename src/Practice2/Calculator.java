package Practice2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Ingresa una cuenta con numeros enteros: ");
            System.out.println("Suma: +, Resta: -, Multiplicación: *, Division: %");
            Scanner scanner = new Scanner(System.in);
            String cuenta = scanner.nextLine();
            String[] values = cuenta.split(" ");
            String symbol = values[1];
            float firstNumber = Float.parseFloat(values[0]);
            float secondNumber = Float.parseFloat(values[2]);
            switch(symbol){
                case "+":
                    System.out.println(Calculator.sum(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(Calculator.rest(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(Calculator.mult(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(Calculator.div(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Símbolo incorrecto, reintente nuevamente");
                    break;
            }
        }
    }
    
    public static float sum(float aNumber, float otherNumber)
    {
        return aNumber + otherNumber;
    }
    
    public static float rest(float aNumber, float otherNumber)
    {
        return aNumber - otherNumber;
    }
    
    public static float mult(float aNumber, float otherNumber)
    {
        return aNumber * otherNumber;
    }
    
    public static float div(float aNumber, float otherNumber)
    {
        return aNumber / otherNumber;
    }
}
