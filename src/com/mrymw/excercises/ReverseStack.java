package com.mrymw.excercises;


import java.util.Stack;

public class ReverseStack {
    public static void reverse(int [] array) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        for (int elements : array) {
            stack.push(elements);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop();
        }
        System.out.println("Reversed Array: ");
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
