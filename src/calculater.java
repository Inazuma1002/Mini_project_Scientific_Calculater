import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.println("Welcome to the Scientific Calculator!");

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, sin, cos, tan, sqrt): ");
        operator = input.next();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: cannot divide by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("The quotient is: " + result);
                }
                break;
            case "sin":
                result = Math.sin(num1);
                System.out.println("The sine of " + num1 + " is: " + result);
                break;
            case "cos":
                result = Math.cos(num1);
                System.out.println("The cosine of " + num1 + " is: " + result);
                break;
            case "tan":
                result = Math.tan(num1);
                System.out.println("The tangent of " + num1 + " is: " + result);
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                System.out.println("The square root of " + num1 + " is: " + result);
                break;
            default:
                System.out.println("Error: invalid operator");
        }
    }
}
