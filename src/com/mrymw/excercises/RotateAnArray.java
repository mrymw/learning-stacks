package com.mrymw.excercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateAnArray {
    public static void rotate(int[] array, int size, int elements) {
        elements =  elements % size;
        int temp[] = new int[size];
        int index =  0;
        for (int i = elements; i < size; i++) {
            temp[index] = array[i];
            index++;
        }
        for (int i=0; i < elements; i++) {
            temp[index] = array[i];
            index++;
        }
        for (int i =0; i< size; i++) {
            array[i] = temp[i];
            System.out.print(array[i]+" ");
        }
    }
}
