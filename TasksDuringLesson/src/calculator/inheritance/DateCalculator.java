package calculator.inheritance;

import java.time.LocalDate;

public class DateCalculator extends StandardCalculator{

    public LocalDate addDaysToDate(LocalDate date, long days) {
        return date.plusDays(days);
    }
}
