package org.tp1JavaWeb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScientificCalculatorTest {
    ScientificCalculator sc;
    @BeforeEach
    void setup(){
        sc = new ScientificCalculator();
        System.out.println("antes de teste");
    }

    @Test
    void testAddition(){
        System.out.println("teste 1");
        double result = sc.add(10,10);
        assertEquals(20, result,0.001);
    }

    @Test
    void testSubtraction(){
        System.out.println("teste 2");
        //Setup
        ScientificCalculator calculator = new ScientificCalculator();
        //Execution
        double retult = calculator.subtract(5,3);
        //Assertion
        assertEquals(2, retult, 0.001);
        //Teardown - limpeza de código desnecessaria nesse exemplo
    }


}
