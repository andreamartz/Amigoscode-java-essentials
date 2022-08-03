package dev.andreamartz;

import java.math.BigDecimal;

public class Money_BigDecimal {
    public static void main(String[] args) {
//        double numberOne = 0.02;
//        double numberTwo = 0.03;
//        double result = numberTwo - numberOne;
//        // Don't use double data type when dealing with money! It doesn't have enough precision:
//        System.out.println(result);   // 0.009999999999999998

        // Use Big Decimal type instead:
        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        // Don't use double data type when dealing with money! It doesn't have enough precision:
        System.out.println(result);   // 0.01

    }
}
