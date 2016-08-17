package ru.yole.kxdate

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

object ago

object fromNow

val Int.nanoseconds: Duration
    get() = Duration.ofNanos(toLong())

val Int.microseconds: Duration
    get() = Duration.ofNanos(toLong() * 1000L)

val Int.milliseconds: Duration
    get() = Duration.ofMillis(toLong())

val Int.seconds: Duration
    get() = Duration.ofSeconds(toLong())

val Int.minutes: Duration
    get() = Duration.ofMinutes(toLong())

val Int.hours: Duration
    get() = Duration.ofHours(toLong())

val Int.days: Period
    get() = Period.ofDays(this)

val Int.weeks: Period
    get() = Period.ofWeeks(this)

val Int.months: Period
    get() = Period.ofMonths(this)

val Int.years: Period
    get() = Period.ofYears(this)

val Duration.ago: LocalDateTime
    get() =  baseTime() - this

val Duration.fromNow: LocalDateTime
    get() =  baseTime() + this

val Period.ago: LocalDate
    get() = baseDate() - this

val Period.fromNow: LocalDate
    get() = baseDate() + this

infix fun Int.nanoseconds(fromNow: fromNow) = baseTime().plusNanos(toLong())

infix fun Int.nanoseconds(ago: ago) = baseTime().minusNanos(toLong())

infix fun Int.microseconds(fromNow: fromNow) = baseTime().plusNanos(1000L * toLong())

infix fun Int.microseconds(ago: ago) = baseTime().minusNanos(1000L * toLong())

infix fun Int.milliseconds(fromNow: fromNow) = baseTime().plusNanos(1000000L * toLong())

infix fun Int.milliseconds(ago: ago) = baseTime().minusNanos(1000000L * toLong())

infix fun Int.seconds(fromNow: fromNow) = baseTime().plusSeconds(toLong())

infix fun Int.seconds(ago: ago) = baseTime().minusSeconds(toLong())

infix fun Int.minutes(fromNow: fromNow) = baseTime().plusMinutes(toLong())

infix fun Int.minutes(ago: ago) = baseTime().minusMinutes(toLong())

infix fun Int.hours(fromNow: fromNow) = baseTime().plusHours(toLong())

infix fun Int.hours(ago: ago) = baseTime().minusHours(toLong())

infix fun Int.days(fromNow: fromNow) = baseDate().plusDays(toLong())

infix fun Int.days(ago: ago) = baseDate().minusDays(toLong())

infix fun Int.weeks(fromNow: fromNow) = baseDate().plusWeeks(toLong())

infix fun Int.weeks(ago: ago) = baseDate().minusWeeks(toLong())

infix fun Int.months(fromNow: fromNow) = baseDate().plusMonths(toLong())

infix fun Int.months(ago: ago) = baseDate().minusMonths(toLong())

infix fun Int.years(fromNow: fromNow) = baseDate().plusYears(toLong())

infix fun Int.years(ago: ago) = baseDate().minusYears(toLong())

private fun baseDate() = LocalDate.now()

private fun baseTime() = LocalDateTime.now()

