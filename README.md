# kxdate

This library contains various Kotlin extensions for the [Java 8 java.time API](https://docs.oracle.com/javase/tutorial/datetime/iso/index.html).

## Rails Style Date Constants

kxdate supports the [Rails-style](http://guides.rubyonrails.org/active_support_core_extensions.html#time) syntax for defining date constants:

```
val twoMonthsLater = 2.months.fromNow

val yesterday = 1.days.ago

(4.months + 5.years).fromNow
```

Alternatively, you can use the infix call syntax:

```
val twoMonthsLater = 2 months fromNow
val yesterday = 1 days ago
```
