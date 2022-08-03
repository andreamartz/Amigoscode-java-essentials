package dev.andreamartz;

import java.util.LinkedList;
import java.util.Queue;

// Queues are FIFO: first in, first out
public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("James"));
        queue.add(new Person("Jamila"));
        queue.offer(new Person("Abu"));
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        // looping
        queue.forEach(person -> System.out.println(person.name));
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
