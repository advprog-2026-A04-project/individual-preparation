package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticUtilityTest {

    @Test
    void exponent_raisedToPower() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        assertEquals(27, arithmeticUtility.exponent(3, 3));
        assertEquals(-27, arithmeticUtility.exponent(-3, 3));
    }

    @Test
    void multiply_multipliesOperands() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        assertEquals(12.5, arithmeticUtility.multiply(2.5, 5.0), 1e-9);
        assertEquals(-6.0, arithmeticUtility.multiply(2.0, -3.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.multiply(0.0, 123.0), 1e-9);
    }
}

