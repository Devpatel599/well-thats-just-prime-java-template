package org.example;

import java.util.ArrayList;

public class Factorizer {
    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> factors = new ArrayList<>();

        if (n == null || n <= 1) {
            return factors; 
        }

        
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

       
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

       
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}
