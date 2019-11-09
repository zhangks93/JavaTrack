import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    LocalDateTime localDateTime;
    long GIGA_SECOND = 1_000_000_000;

    Gigasecond(LocalDateTime moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.localDateTime = moment;
    }

    Gigasecond(LocalDate moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this(moment.atStartOfDay());
    }

    LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return localDateTime.plusSeconds(GIGA_SECOND);
    }
}
