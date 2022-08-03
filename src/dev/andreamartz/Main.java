package dev.andreamartz;

import java.awt.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Australia/West"));
        LocalDateTime now = LocalDateTime.now();

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);

        System.out.println(someDate.minus(2, ChronoUnit.DECADES));

        System.out.println(someDate.isAfter(now.toLocalDate()));
        System.out.println(someDate.getYear());
        System.out.println(someDate.getMonth());
        System.out.println(someDate.getDayOfWeek());


        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.now());
    }
}