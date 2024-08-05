package com.mrymw.excercises;

import static com.mrymw.excercises.ExpressionBalancing.expressionBrackets;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int size = array.length;
        int elements = 2;
        RotateAnArray.rotate(array, size, elements);
        String[] brackets = {"([{}])", "([{}]))", "([{}]", "{[()]}"};
        for (String exp : brackets) {
            if (expressionBrackets(exp))
                System.out.println("Balanced: " + exp);
            else
                System.out.println("Not Balanced: " + exp);
        }
        int [] stackArray = {2,4,6,8};
        ReverseStack.reverse(stackArray);

        String sentence = "apples and bananas";
        WordReversal.reverseString(sentence);



    }


}
