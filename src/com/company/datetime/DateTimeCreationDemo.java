package com.company.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Scanner;

public class DateTimeCreationDemo {

    public static void main(String[] args) {
        var localTime = LocalTime.now();
        System.out.println(localTime);
        var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        var localDate = LocalDate.of(2056, Month.FEBRUARY, 6);
        System.out.println(localDate);

        var str = "1973-04-15";
        var dt = LocalDate.parse(str);
        var dt2 = dt.plusDays(500);
        System.out.println(dt);
        System.out.println(dt2);

//        System.out.println("enter date (dd.mm.yyyy)");
//        var scanner = new Scanner(System.in);
//        var userStrDate = scanner.next();
//
        var formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
//        var userDate = LocalDate.parse(userStrDate, formatter);
//        System.out.println(userDate);

        var now = LocalDate.now();
        var nowDT1 = formatter.format(now);
        var nowDT2 = now.format(formatter);
        System.out.println(nowDT1);
        System.out.println(nowDT2);

        var now2050 = now.withYear(2050);
        System.out.println(now2050);

        var nextWed = now.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);
    }

}
