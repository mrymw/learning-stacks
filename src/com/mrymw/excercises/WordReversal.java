package com.mrymw.excercises;

import java.util.*;

public class WordReversal {
    public static void reverseString(String sentence){
        String[] word = sentence.split(" ");
        Stack<String> stack = new Stack<>();
        Stack<String> tempStack = new Stack<>();
        if (sentence.isEmpty()) {
            System.out.println("Cannot perform as string is EMPTY!");
        } else {
            for (int i = 0; i < word.length-1; i++) {
                word[i]+= "";
            }
            for (String each : word) {
                stack.push(each);
            }
            System.out.println(Arrays.toString(word));
            System.out.println(stack);
            System.out.println(stack.peek());
            List<String> arrayList = new ArrayList<>();
            while (!stack.isEmpty()) {
                arrayList.add(stack.pop());
            }
            System.out.println(arrayList);
        }
    }
}
