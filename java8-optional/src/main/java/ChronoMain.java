import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ChronoMain {

    public static void main(String[] args) {

        LocalDate lastValentines = LocalDate.of(2018, 2, 14);
        System.out.println("Day: " + lastValentines.getYear() +
                " Month: " + lastValentines.getMonth() +
                " Day: " + lastValentines.getDayOfMonth());

        System.out.println(lastValentines);

        LocalDate fromString = lastValentines.parse("2019-04-05");
        System.out.println(fromString);
        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");
// formater daty
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String s = dtf.format(lastValentines);
        System.out.println(s);

        System.out.println(lastValentines.parse("11.12.2017", dtf));
        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");
        // Local Time

        LocalTime sevenFifteen = LocalTime.of(7, 15, 0);
        System.out.println(sevenFifteen);
        System.out.println(sevenFifteen.getSecond());
        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");
        // Date and Time

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime someTime = LocalDateTime.of(2018, 1, 19, 8, 0, 0);
        System.out.println(someTime);

        System.out.println(someTime.toLocalDate());
        System.out.println(someTime.toLocalTime());
        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");
        //other timezone

        ZoneId zoneId = ZoneId.of("Pacific/Auckland");
        ZonedDateTime zdt = someTime.atZone(zoneId);
        System.out.println(zdt);
        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");
        //Clock and methods

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = ld1.minusDays(234);
        System.out.println(ld1);
        System.out.println(ld2);

        Period p = Period.between(ld1, ld2);
        System.out.println(p);

        Period ownPeriod = Period.of(2, 3, 11);
        System.out.println(ownPeriod);

        System.out.println("=========:::::::::=========:::::::::=========:::::::::=========:::::::::========");

        //Counting time of the process

        LocalTime start = LocalTime.now();

        Random random = new Random();
        for (int i = 0; i < 800000; i++) {
            System.out.println(random.nextDouble());
        }

        LocalTime end = LocalTime.now();
        System.out.println("Process started at: " + start);
        System.out.println("Process ended at: " + end);

        Duration result = Duration.between(end, start);
        System.out.println("Process took exactly: " + result);


    }


}
