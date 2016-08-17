package ru.yole.kxdate

import java.time.Duration
import java.time.LocalDateTime
import java.time.Period
import java.time.temporal.TemporalAmount

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

val Int.days: Duration
    get() = Duration.ofDays(toLong())

val Int.weeks: Period
    get() = Period.ofWeeks(this)

val Int.months: Period
    get() = Period.ofMonths(this)

val Int.years: Period
    get() = Period.ofYears(this)

val TemporalAmount.ago: LocalDateTime
    get() =  LocalDateTime.now() - this

val TemporalAmount.fromNow: LocalDateTime
    get() =  LocalDateTime.now() + this
