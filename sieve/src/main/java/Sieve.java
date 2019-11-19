import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Sieve {

    int maxPrime;

    Sieve(int maxPrime) {
       this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> result = new ArrayList<>();

        Instant start = Instant.now();

        if (this.maxPrime < 2) return result;
        for (int j = 2; j <= this.maxPrime; j++){
            if (check(j)) result.add(j);
        }

        Instant end = Instant.now();
        System.out.println(ChronoUnit.MILLIS.between(start,end));
        return result;
    }

    boolean check (int number){
        if (number == 2 || number == 3) return true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++ ){
            if (number % i == 0) return false;
        }
        return true;
    }
}
