package com.mrymw.datastructures;

public class PerfectNumber {
    public static String perfectNumbers(int num) {
        int sum = 0, i = 1;
        if (num > 1000) {
            return num + " is greater than 1000, cannot perform";
        } else {
            while (i <= num / 2) {
                if (num % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
            if (sum == num) {
                return num + " is a perfect number";
            } else {
                return num + " is not a perfect number";
            }
        }
    }
}
