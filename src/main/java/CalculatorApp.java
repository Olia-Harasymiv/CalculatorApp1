package main.java;

import main.java.exception.MoreThan100Exception;

import static main.java.Printer.print;
public class CalculatorApp {

    private static final Reader reader = new Reader();
    private static final Calculator calc = new Calculator();
    public static void main(String[] args) throws MoreThan100Exception {
        char maths;
        double number1;
        double number2;

        print("Enter your 1st number");
        number1 = reader.getDouble();
        print("Choose operations: +, -, *, or /");
        maths = reader.getChar();
        print("Enter your 2nd number");
        number2 = reader.getDouble();


        switch (maths) {
            case '+' -> {
                double result = calc.add(number1, number2);

                checkForException(result);
                print(number1 + " + " + number2 + " = " + result);
            }
            case '-' -> {
                double result = calc.subtract(number1, number2);

                checkForException(result);
                print(number1 + " - " + number2 + " = " + result);
            }
            case '*' -> {
                double result = calc.multiply(number1, number2);

                checkForException(result);
                print(number1 + " * " + number2 + " = " + result);
            }
            case '/' -> {
                double result = calc.divide((int) number1, (int) number2);

                checkForException(result);
                print(number1 + " / " + number2 + " = " + result);
            }
            default -> print("Invalid operator!");
        }
    }

    private static void checkForException(double c) throws MoreThan100Exception{
        if (c > 100) {
            throw new MoreThan100Exception("Result cannot be more than 100");
        }
    }
}
