package dev.andreamartz;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 20, 500, 4};
//        can't add another number to the array after it has been defined
//        numbers[4] = 700;

        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));
        // loop through the array:
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
