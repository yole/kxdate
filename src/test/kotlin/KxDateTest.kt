package ru.yole.kxdate

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class KxDateTest {
    @Test
    fun oneDayAgo() {
        val x = 1.days.ago
        assertEquals(LocalDate.now().minusDays(1), x)
    }

    @Test
    fun oneDayAgoInfix() {
        val x = 1 days ago
        assertEquals(LocalDate.now().minusDays(1), x)
    }

    @Test
    fun oneWeekFromNow() {
        val x = 1.weeks.fromNow
        assertEquals(LocalDate.now().plusDays(7), x)
    }

    @Test
    fun oneMonthFromNow() {
        val x = 1.months.fromNow
        assertEquals(LocalDate.now().plusMonths(1), x)
    }

    @Test
    fun addDurations() {
        val x = (4.months + 5.years).fromNow
        assertEquals(LocalDate.now().plusMonths(4).plusYears(5), x)
    }

    @Test
    fun oneHourFromNow() {
        val x = 1.hours.fromNow
        Assert.assertEquals(LocalDateTime.now().plusHours(1).truncatedTo(ChronoUnit.HOURS), x.truncatedTo(ChronoUnit.HOURS))
    }
}
