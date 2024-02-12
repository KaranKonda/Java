import java.time.*;

public class day5_ex9 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId sourceZone = ZoneId.of("America/New_York");
        ZoneId targetZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime sourceDateTime = ZonedDateTime.of(dateTime, sourceZone);
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);

        System.out.println("Source DateTime: " + sourceDateTime);
        System.out.println("Target DateTime: " + targetDateTime);
    }
}
