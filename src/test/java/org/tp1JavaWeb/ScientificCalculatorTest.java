package org.tp1JavaWeb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScientificCalculatorTest {
    ScientificCalculator sc;
    @BeforeEach
    void setup(){
        sc = new ScientificCalculator();
    }

    @Test
    void shouldReturnCorrectSumWhenAddingTwoNumbers (){
        double result = sc.add(10,10);
        assertEquals(20, result,0.001);
    }

    @Test
    void shouldReturnCorrectDifferenceWhenSubtractingNumbers(){
        //Setup
        ScientificCalculator calculator = new ScientificCalculator();
        //Execution
        double retult = calculator.subtract(5,3);
        //Assertion
        assertEquals(2, retult, 0.001);
        //Teardown - limpeza de código desnecessaria nesse exemplo
    }

    @Test
    void shouldReturnCorrectSquareRootForPositiveNumber (){
        double result = sc.squareRoot(64.00);
        assertEquals(8,result,0.001);
    }

    @Test
    void shouldThrowExceptionWhenCalculatingSquareRootOfNegativeNumber(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
            sc.squareRoot(-4);
        });
        assertEquals("Negative number", iae.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
            sc.divide(20, 0);
        });

        assertEquals("Division by zero", iae.getMessage());
    }

    @Test
    void shouldReturnCorrectLogarithmForCommonPositiveValues(){
        assertAll(
                () -> assertEquals(1,sc.log(Math.E),0.001),
                () -> assertEquals(2.302585,sc.log(10),0.001),
                () -> assertEquals(0,sc.log(1),0.001),
                () -> assertEquals(-0.693147,sc.log(0.5),0.001)
        );
    }

    @Test
    void shouldReturnCorrectSineValueForCommonAngles(){
        assertAll(
                () -> assertEquals(0.0, sc.sin(0), 0.0001),
                () -> assertEquals(0.5, sc.sin(30), 0.0001),
                () -> assertEquals(Math.sqrt(2)/2, sc.sin(45), 0.0001),
                () -> assertEquals(1.0, sc.sin(90), 0.0001),
                // Angulo maior que 360
                () -> assertEquals(0.0, sc.sin(360), 0.0001),
                () -> assertEquals(1.0, sc.sin(450), 0.0001)
        );
    }
}
