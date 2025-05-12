package org.tp1JavaWeb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalculatorTest {
    ScientificCalculator sc = new ScientificCalculator();

    @Test
    void testAddition(){
        double result = sc.add(10,10);
        assertEquals(20, result,0.001);
    }

}
