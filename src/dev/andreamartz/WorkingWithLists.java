package dev.andreamartz;

import java.util.ArrayList;
import java.util.List;


public class WorkingWithLists {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        // with a List, you can add as many elements as you want:
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);

        System.out.println(numbers);

        // loop through a list
        for(Object number : numbers) {
            System.out.println(number);
        }

        // another way to loop
        System.out.println();
        numbers.forEach(System.out::println);
    }
}
