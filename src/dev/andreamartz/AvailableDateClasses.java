package dev.andreamartz;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class AvailableDateClasses {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();
        System.out.println(now);
        System.out.println(nowLDT);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);
    }
}
