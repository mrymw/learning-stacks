package com.mrymw.datastructures;

import java.util.*;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter a Positive Number");
        int num = input.nextInt();
        System.out.println(com.mrymw.datastructures.PerfectNumber.perfectNumbers(num));
        System.out.println(com.mrymw.datastructures.PrimeNumber.listPrimeNumber(num));*/
        System.out.println("<--- Stacks --->");
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.peak());

        /*System.out.println("<--- Queue --->");
        Queue<Integer> queue = new Queue<>(7);
        queue.enqueue(5);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.front());
        queue.dequeue();
        System.out.println(queue);*/

        System.out.println("<--- JAVA QUEUE --->");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);

        /*
        * Stacks: push, pop, peek
        * Queue : enqueue (add), dequeue (remove), front (peek)
        */
    }
}
