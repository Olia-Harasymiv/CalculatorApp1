import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char maths;
        Double number1, number2, result;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        number1 = number.nextDouble();
        System.out.println("Choose operations: +, -, *, or /");
        maths = number.next().charAt(0);

        System.out.println("Enter your 2nd number");
        number2 = number.nextDouble();


        switch (maths) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        number.close();
    }
}
