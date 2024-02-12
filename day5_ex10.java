import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class day5_ex10 {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();
        DayOfWeek nextBirthdayDayOfWeek = birthDate.withYear(today.getYear()).getDayOfWeek();

        System.out.println("Day of the week of birth: " + birthDayOfWeek);
        System.out.println("Day of the week of next birthday: " + nextBirthdayDayOfWeek);
    }
}
