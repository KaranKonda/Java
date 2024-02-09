import java.util.Scanner;
 class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}


public class Exception_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                throw new InvalidInputException("Division by zero is not allowed.");
            }
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Program has ended.");

        }
    }
}
