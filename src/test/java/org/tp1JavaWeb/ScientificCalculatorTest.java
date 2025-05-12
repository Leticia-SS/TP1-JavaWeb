package org.tp1JavaWeb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScientificCalculatorTest {
    ScientificCalculator sc;
    @BeforeEach
    void setup(){
        sc = new ScientificCalculator();
    }

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

    @Test
    void testSquareRootPositive(){
        double result = sc.squareRoot(64.00);
        assertEquals(8,result,0.001);
    }

    @Test
    void testSquareRootNegative(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
            sc.squareRoot(-4);
        });
        assertEquals("Negative number", iae.getMessage());
    }

    @Test
    void testDivideByZero(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
            sc.divide(20, 0);
        });

        assertEquals("Division by zero", iae.getMessage());
    }
}
