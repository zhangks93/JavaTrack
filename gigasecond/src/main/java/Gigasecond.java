import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    LocalDateTime localDateTime;

    Gigasecond(LocalDate moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.localDateTime = moment.atTime(0, 0, 0);
    }

    Gigasecond(LocalDateTime moment) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.localDateTime = moment;
    }

    LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        LocalDateTime result = localDateTime.plus(1000000000, ChronoUnit.SECONDS);
        return result;
    }
}
