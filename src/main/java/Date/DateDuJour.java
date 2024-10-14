package Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Month;


public class DateDuJour {
    public static void main(String[] args) {
//        System.out.println("coucou");
        Calendar date = Calendar.getInstance();
        // Date et heure d'aujourd'hui en utilisant le fuseau horaire de la France
        Calendar dateFrance = Calendar.getInstance(Locale.FRANCE);
        // Date et heure d'aujourd'hui en utilisant le fuseau horaire GMT
        Calendar dateGmt = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        System.out.println(date.toInstant());

        // On positionne la date au 8 juin 2005 à 12:00:00
        date.set(2016, 4, 19, 23, 59, 30);

        System.out.println(date.toInstant());

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // 01/09/2010
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.MAY, 19, 23, 59);
        System.out.println(dateTime.format(datePattern));


    }
}
