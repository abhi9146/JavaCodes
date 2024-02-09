
import java.time.*;

public class locaDatetimel {
     public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        System.out.println(d.getMonth());
     }
}
