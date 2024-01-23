import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate time = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMMM dd yyyy");
        String formattedDate = time.format(format);

        System.out.println("Today is " + formattedDate);
    }
}