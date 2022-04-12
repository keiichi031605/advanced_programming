package KeiichiJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


import week4.Calculator;



class CalculatorTest {
	
	Calculator calculator;
	
	//	Annotated with @BeforeEach
    @BeforeEach                                         
    void setUp() {
        calculator = new Calculator();
    }
    
    // test add();
    @Test
	public void testAdd() {
		calculator = new Calculator();
		int a = 1234;
		int b = 5678;
		int actual = calculator.add(a, b);
		
		int expected = 6912;

		assertEquals(expected, actual);
	}
    
    // test multiply();
    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");  
    }

    @RepeatedTest(5)                                    
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
        assertEquals(calculator.multiply(4,5), 20, "Regular multiplication should work");
    }
    
}
