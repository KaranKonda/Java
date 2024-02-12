import java.util.*;

public class day5_ex4 {
    public static void doublenum(Collection<? extends Number> numbers) {

        for (Number number : numbers) {
            double result = number.doubleValue()*2;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        doublenum(integerList);

        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
         doublenum(doubleList);
    }
}
