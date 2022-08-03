package dev.andreamartz;

import java.util.Stack;

// Stacks are LIFO: last in, first out
public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
