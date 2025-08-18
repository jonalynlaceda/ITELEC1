import java.util.Scanner;

public class Activity {
    public static Object calculate(int a, String operator, int b) {
        Object result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    result = "Error: Cannot divide by zero";
                } else {
                    result = a / b;
                }
                break;
            default:
                result = "Error: Unknown operator";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for inputs
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display result
        System.out.println("Result: " + calculate(a, operator, b));

        sc.close();
    }
}
