package com.mrymw.excercises;

public class ExpressionBalancing {
    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public ExpressionBalancing(int s) {
        this.maxSize = s;
        this.stackArray = new char[maxSize];
        top = -1;
    }
    public char push(char data) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = data;
            return data;
        }
        return 0;
    }
    public char pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return 0;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public char top() {
        return stackArray[top];
    }
    public void printStack() {
        if (top >= 0) {
            System.out.println("Elements in stack : ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }
    static boolean expressionBrackets(String exp) {
        ExpressionBalancing stack = new ExpressionBalancing(exp.length());
        char check;
        for (int i = 0; i < exp.length(); i++) {
            char x = exp.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()) return false;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check != '(') return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check != '{') return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check != '[') return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}

