import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;
            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case '/':
                try {
                    System.out.println("Result: " + divide(num1, num2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
