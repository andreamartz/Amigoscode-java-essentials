package dev.andreamartz;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// a list can contain multiple data types
public class WorkingWithLists {
    public static void main(String[] args) {
//        List numbers = new ArrayList();

        // let's make the list generic now:
            // we must specify the type of data the List will contain; we can't specify primitives here, so we have to say Integer instead of int
        List <Integer> numbers = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        // with a List, you can add as many elements as you want:
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(100);
        numbers.add(9000);
        // the generic list numbers can contain only integers; the following statements produce compilation errors:
//        numbers.add("hello");
//        numbers.add(new Point(10, 10));
//        numbers.add('A');

        System.out.println(numbers);
        System.out.println(numbers.contains(9000));

//        numbers.clear();

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());

        // loop through a list
        for(int number : numbers) {
            System.out.println(number);
        }

        // another way to loop
        System.out.println();
//        numbers.forEach(System.out::println);
    }
}
