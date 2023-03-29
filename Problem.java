import java.util.Scanner;

public class SimpleJavaProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Calculate sum, difference, product, and quotient
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double quotient = 0.0;

        // Check for division by zero
        if (num2 != 0) {
            quotient = (double) num1 / num2;
        } else {
            System.out.println("Error: division by zero.");
            System.exit(0);
        }

        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
