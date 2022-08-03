package dev.andreamartz;

import java.awt.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Australia/West"));


//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.now());
    }
}