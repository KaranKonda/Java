import java.util.*;

public class day3_ex5 {
    public static void main(String[] args) {
        String correctUsername = "user123";
        String correctPassword = "password123";
        Scanner scanner = new Scanner(System.in);


        String enteredUsername;
        String enteredPassword;

        boolean isLoggedIn = false;

        do {
            System.out.print("Enter username: ");
            enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                isLoggedIn = true;
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        } while (!isLoggedIn);


    }
}
