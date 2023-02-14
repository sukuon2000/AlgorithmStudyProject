package level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Year2016 {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString().substring(0, 3);
    }
}
