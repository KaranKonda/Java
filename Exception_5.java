import java.util.*;
 class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class Exception_5 {
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";
    private static final int ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts <ATTEMPTS) {
            try {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
                    attempts++;
                    throw new AuthenticationException("Incorrect username or password. Please try again.");
                } else {
                    System.out.println("Login successful! Welcome, " + username + ".");
                    break;
                }
            } catch (AuthenticationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (attempts == ATTEMPTS) {
            System.out.println("Account locked");
        }

    }
}
