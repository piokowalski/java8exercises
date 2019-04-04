import java.time.LocalDate;
import java.time.LocalTime;
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


    }

}
