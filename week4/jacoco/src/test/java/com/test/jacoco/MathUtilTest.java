package com.test.jacoco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.subtract(3, 2));
    }

    @Test
    void testIsEven() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(4));
        assertFalse(mathUtils.isEven(5));
    }

    @Test
    void testFactorial() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(120, mathUtils.factorial(5));
        assertEquals(1, mathUtils.factorial(0));
    }

   @Test
    void testFactorialNegative() {
    MathUtils mathUtils = new MathUtils();
    assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
}

}

