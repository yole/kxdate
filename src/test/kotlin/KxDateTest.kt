package ru.yole.kxdate

import org.junit.Assert
import org.junit.Test
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class KxDateTest {
    @Test
    fun oneDayAgo() {
        val x = 1.days.ago
        assertSameDate(LocalDateTime.now().minusDays(1), x)
    }

    @Test
    fun oneWeekFromNow() {
        val x = 1.weeks.fromNow
        assertSameDate(LocalDateTime.now().plusDays(7), x)
    }

    @Test
    fun oneMonthFromNow() {
        val x = 1.months.fromNow
        assertSameDate(LocalDateTime.now().plusMonths(1), x)
    }

    @Test
    fun addDurations() {
        val x = (4.months + 5.years).fromNow
        assertSameDate(LocalDateTime.now().plusMonths(4).plusYears(5), x)
    }

    private fun assertSameDate(expected: LocalDateTime, actual: LocalDateTime) {
        Assert.assertEquals(expected.truncatedTo(ChronoUnit.DAYS), actual.truncatedTo(ChronoUnit.DAYS))
    }
}
