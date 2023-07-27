package Part_12.Test;

import java.time.Instant;

public class DateConverter {
    public Instant convertDateToInstant(String date) {

            Instant dateAsInstant = Instant.parse(date);

            return dateAsInstant;
    }
}
