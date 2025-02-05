package org.alfonso.domain.price;

import org.alfonso.application.DateFormatter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateInRangeTest
{
    DateFormatter dateFormatter = new DateFormatter();
   

    Date startDate = dateFormatter.parseDate("01-01-2020 10:10:10");
    Date endDate = dateFormatter.parseDate("12-12-2020 10:10:10");

    DateInRange underTest = new DateInRange(startDate,endDate);

    @Nested
    class OutOfRange
    {
        @Test
        public void whenDateIsLowerThanStartDateResultShouldBeFalse()
        {
            Date date = dateFormatter.parseDate("01-01-2020 09:00:00");

            Boolean result = underTest.isInRange(date);

            Assertions.assertThat(result).isFalse();
        }

        @Test
        public void whenDateIsHigherThanEndDateResultShouldBeFalse()
        {
            Date date = dateFormatter.parseDate("12-12-2020 10:10:20");

            Boolean result = underTest.isInRange(date);

            Assertions.assertThat(result).isFalse();
        }
    }

    @Nested
    class InRange
    {
        @Test
        public void whenDateIsInRangeResultShouldBeTrue()
        {
            Date date = dateFormatter.parseDate("01-05-2020 15:30:30");

            Boolean result = underTest.isInRange(date);

            Assertions.assertThat(result).isTrue();
        }
    }
}