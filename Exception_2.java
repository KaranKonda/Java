import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_2 {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("input.txt"));

            String line = reader.readLine();
            if (line == null) {
                System.out.println("Error: Input file is empty.");
                return;
            }
            int num1 = Integer.parseInt(line);

            // Read the second number
            line = reader.readLine();
            if (line == null) {
                System.out.println("Error: Second number is missing in the input file.");
                return;
            }
            int num2 = Integer.parseInt(line);

            // Divide the first number by the second number
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Error: File 'input.txt' not found.");

        } catch (NumberFormatException e) {
            // Handle number format exception
            System.out.println("Error: Invalid number format in the input file.");

        } catch (ArithmeticException e) {
            // Handle arithmetic exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");

        } catch (IOException e) {
            // Handle other IO exceptions
            System.out.println("Error: Failed to read from the input file.");

        } finally {
            // Close the file reader if it was opened
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error: Failed to close the file reader.");
            }
            System.out.println("Program has ended.");
        }
    }
}
