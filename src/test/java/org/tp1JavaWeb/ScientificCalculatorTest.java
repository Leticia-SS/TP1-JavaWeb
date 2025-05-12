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

    @Test
    void testSubtraction(){
        //Setup
        ScientificCalculator calculator = new ScientificCalculator();

        //Execution
        double retult = calculator.subtract(5,3);

        //Assertion
        assertEquals(2, retult, 0.001);

        //Teardown - limpeza de código desnecessaria nesse exemplo
    }


}
