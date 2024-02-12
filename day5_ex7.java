
import java.util.*;

public class day5_ex7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        numbers.removeIf(n -> n % 2 == 0);


        System.out.println("Filtered list with only odd numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
