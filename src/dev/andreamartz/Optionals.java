package dev.andreamartz;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
//        String brand = null;
//        String theBrand = Optional.ofNullable(brand).orElse("Brand is null");
//        System.out.println(theBrand);

//        String brand = null;
//        String theBrand = Optional.ofNullable(brand).orElseGet(() -> {
//            // logic
//            return "Samsung";
//        });
//        System.out.println(theBrand);

        String brand = null;
        String theBrand = Optional.ofNullable(brand)
                .map(String:: toUpperCase)
                .orElseGet(() -> {
//              // logic
                return "Samsung";
        });

        System.out.println(theBrand);
    }
}
