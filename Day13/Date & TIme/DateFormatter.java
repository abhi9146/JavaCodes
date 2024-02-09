import java.time.*;
import java.time.format.*;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println(dt.format(df));
    }
}
