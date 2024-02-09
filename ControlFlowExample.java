public class ControlFlowExample {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        // If statement
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // If-else statement
        if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is not less than y");
        }

        // Nested if statement
        if (x == 20) {
            if (y == 10) {
                System.out.println("Nested if: x is 20 and y is 10");
            }
        }

        // If-else-if ladder
        int z = 30;
        if (z < x) {
            System.out.println("z is less than x");
        } else if (z > x) {
            System.out.println("z is greater than x");
        } else {
            System.out.println("z is equal to x");
        }

        // Switch-case statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Jump statements
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                // Continue statement
                continue;
            }
            System.out.println("i = " + i);
            if (i == 7) {
                // Break statement
                break;
            }
        }
    }
}
