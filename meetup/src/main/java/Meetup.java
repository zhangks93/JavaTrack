import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Meetup {
    int month;
    int year;
    MeetupSchedule[] schedules = {MeetupSchedule.FIRST,
                                    MeetupSchedule.SECOND,
                                    MeetupSchedule.THIRD,
                                    MeetupSchedule.FOURTH,
                                    MeetupSchedule.LAST,
                                    MeetupSchedule.TEENTH};

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule schedule){
        LocalDate firstday = LocalDate.of(year,month,1);
        DayOfWeek firstdayweek = firstday.getDayOfWeek();

        int days = 0;
        if (dayOfWeek.getValue() >= firstdayweek.getValue()){
            days = dayOfWeek.getValue() - firstdayweek.getValue();
        }else {
            days = dayOfWeek.getValue() - firstdayweek.getValue() + 7;
        }

        if (schedule.equals(MeetupSchedule.TEENTH)){
            while (days < 12){
                days = days + 7;
            }
        }else {
            days = days + Arrays.asList(schedules).indexOf(schedule) * 7;
        }



        LocalDate result = firstday.plusDays(days);

        if (! result.getMonth().equals(Month.of(month))) return result.minusDays(7);
        return result;
    }
}