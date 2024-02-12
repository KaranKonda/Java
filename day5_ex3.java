import java.util.*;

public class day5_ex3 {
    public static double Sum(Collection<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + Sum(integerList));

        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
        System.out.println("Sum of doubles: " + Sum(doubleList));
    }
}
