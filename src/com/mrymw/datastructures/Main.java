package com.mrymw.datastructures;

import java.util.Scanner;

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
    }
}
