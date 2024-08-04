package com.mrymw.datastructures;

public class Stack {
    int capacity;
    int[] array;
    int top;
    public Stack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;}
    boolean isEmpty() {return (top == -1);}
    boolean isFull() {return (top == (capacity -1));}
    void push (int element) {
        if(isFull()) {
            System.out.println("com.mrymw.datastructures.Stack is Full, CANNOT PUSH!");
        } else {this.array[++top] = element;}}
    int pop () {
        if(isEmpty()) {
            System.out.println("com.mrymw.datastructures.Stack is Empty, CANNOT POP!");
            return -1;
        } else {return this.array[top--];}}
    int peak() {
        if(isEmpty()) {
            System.out.println("com.mrymw.datastructures.Stack is Empty, CANNOT PEAK!");
            return -1;
        } else {return this.array[top];}}

}
