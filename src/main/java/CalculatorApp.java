package main.java;

import static main.java.Printer.print;
public class CalculatorApp {

    private static final Reader reader = new Reader();
    private static final Calculator calc = new Calculator();
    public static void main(String[] args) {

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
            case '+' -> print(number1 + " + " + number2 + " = " + calc.add(number1, number2));
            case '-' -> print(number1 + " - " + number2 + " = " + calc.subtract(number1, number2));
            case '*' -> print(number1 + " * " + number2 + " = " + calc.multiply(number1, number2));
            case '/' -> print(number1 + " / " + number2 + " = " + calc.divide(number1, number2));
            default -> print("Invalid operator!");
        }
    }
}
