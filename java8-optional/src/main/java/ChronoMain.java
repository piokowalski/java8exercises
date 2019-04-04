import java.time.*;
import java.time.format.DateTimeFormatter;

public class ChronoMain {

    public static void main(String[] args) {

        LocalDate lastValentines = LocalDate.of(2018, 2, 14);
        System.out.println("Day: "+lastValentines.getYear() +
                " Month: " +lastValentines.getMonth() +
                " Day: " +lastValentines.getDayOfMonth());

        System.out.println(lastValentines);

        LocalDate fromString = lastValentines.parse("2019-04-05");
        System.out.println(fromString);
// formater daty
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String s = dtf.format(lastValentines);
        System.out.println(s);

        System.out.println(lastValentines.parse("11.12.2017", dtf));

        // Local Time

        LocalTime sevenFifteen = LocalTime.of(7,15,0 );
        System.out.println(sevenFifteen);
        System.out.println(sevenFifteen.getSecond());

        // Date and Time

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime someTime = LocalDateTime.of(2018,1,19,8,0,0);
        System.out.println(someTime);

        System.out.println(someTime.toLocalDate());
        System.out.println(someTime.toLocalTime());
        //other timezone

        ZoneId zoneId = ZoneId.of("Pacific/Auckland");
        ZonedDateTime zdt = someTime.atZone(zoneId);
        System.out.println(zdt);


        //Clock




    }

}
