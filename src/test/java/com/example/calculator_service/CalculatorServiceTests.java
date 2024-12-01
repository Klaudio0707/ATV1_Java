package com.example.calculator_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class CalculatorServiceTests {

    private final CalculatorService calculatorService = new CalculatorService();


    @Test
    void testSum(){
        int resultSum = calculatorService.sum(2, 3);
    System.out.println("Resultado do método sum: " + resultSum);
    assertEquals(5, resultSum);
}

@Test
void testSub() {
    int resultSub = calculatorService.sub(5, 3);
    System.out.println("Resultado do método sub: " + resultSub); 
    assertEquals(2, resultSub); 
}

    @Test
    void testMultiply(){
        int resultMultiply = calculatorService.multiply(5, 3);
        System.out.println("Resultado do método multiply: " + resultMultiply); 
        assertEquals(15, resultMultiply); 
    }

    @Test
    void testDivision() {
        double resultDivision = calculatorService.divide(30, 5);
        System.out.println("Resultado do método division: " + resultDivision);
        assertEquals(6.0, resultDivision, 0.0001); 
    }
    
    


    @Test
    void testDivisionByFraction() {
        double resultDivision = calculatorService.divide(10, 0.5);
        System.out.println("Resultado do método division (10 ÷ 0.5): " + resultDivision);
        assertEquals(20.0, resultDivision, 0.0001); 
    }
    
    @Test
    void testDivisionByZero() {
        try {
            calculatorService.divide(10, 0);
            System.out.println("Erro! Nenhuma exceção foi lançada ao dividir por zero.");
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada ao dividir por zero: " + e.getMessage());
            assertEquals("Cannot divide by zero", e.getMessage()); 
        }
    }
}