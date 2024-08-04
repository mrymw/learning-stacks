package com.mrymw.datastructures;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean primeNumbers(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<Integer> listPrimeNumber(int num) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (primeNumbers(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
