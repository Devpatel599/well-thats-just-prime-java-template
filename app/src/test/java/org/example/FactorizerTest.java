package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FactorizerTest {
    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        assertEquals(factorizer.primeFactors(0), new ArrayList<>());
    }

    @Test
    void itReturnsAnEmptyListForOne() {
        Factorizer factorizer = new Factorizer();
        assertEquals(factorizer.primeFactors(1), new ArrayList<>());
    }

    @Test
    void itReturnsCorrectFactorsForCompositeNumbers() {
        Factorizer factorizer = new Factorizer();
        assertEquals(factorizer.primeFactors(9), Arrays.asList(3, 3));
        assertEquals(factorizer.primeFactors(10), Arrays.asList(2, 5));
        assertEquals(factorizer.primeFactors(36), Arrays.asList(2, 2, 3, 3));
    }

    @Test
    void itReturnsTheNumberItselfForPrimeNumbers() {
        Factorizer factorizer = new Factorizer();
        assertEquals(factorizer.primeFactors(17), Arrays.asList(17));
        assertEquals(factorizer.primeFactors(19), Arrays.asList(19));
    }
}
