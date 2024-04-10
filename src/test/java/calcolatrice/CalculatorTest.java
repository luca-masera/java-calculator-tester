package calcolatrice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void createInstance(){
        calculator = new Calculator();
    }


    @Test
    @DisplayName("Testo la funzione add")
    void testAdd(){
        assertEquals(10.00f, calculator.add(5f,5f),0.001);
        assertEquals(5.00f, calculator.add(3f,2f),0.001);
        assertEquals(2f, calculator.add(1f,1f),0.001);

    }
    @Test
    @DisplayName("Testo la funzione substract")
    void testSubstract(){
        assertEquals(1.00f, calculator.substract(5f,4f),0.001);
        assertEquals(5.00f, calculator.substract(10f,5f),0.001);
        assertEquals(20f, calculator.substract(50f,30),0.001);

    }
    @Test
    @DisplayName("Testo la funzione divide")
    void testDivide(){
        assertEquals(4, calculator.divide(8,2),0.001);
        assertEquals(10, calculator.divide(100,10),0.001);
        assertEquals(-4, calculator.divide(-8,2),0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4,0));

    }
    @Test
    @DisplayName("Testo la funzione multiply")
    void testMultiply(){
        assertEquals(6, calculator.multiply(3,2),0.001);
        assertEquals(0f, calculator.multiply(10,0),0.001);
        assertEquals(20f, calculator.multiply(10,2),0.001);

    }

}