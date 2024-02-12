import java.time.*;

public class day5_ex8 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 11);

        Period period = Period.between(startDate, endDate);

        System.out.println("Difference: " + period.getYears() + " years, "
                + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
