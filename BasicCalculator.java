import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers : ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter Operation: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Error! Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
