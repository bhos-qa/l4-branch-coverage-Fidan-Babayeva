package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Main.calculateFactorial(0));
        assertEquals(1, Main.calculateFactorial(1));
        assertEquals(24, Main.calculateFactorial(4));
    }

    @Test
    public void testIsPrime() {
        assertTrue(Main.isPrime(2));
        assertTrue(Main.isPrime(7));
        assertFalse(Main.isPrime(4));
        assertFalse(Main.isPrime(1));
    }

    @Test
    public void testReverseString() {
        assertEquals("cba", Main.reverseString("abc"));
        assertEquals("madam", Main.reverseString("madam"));
    }

    @Test
    public void testGenerateFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5};
        assertArrayEquals(expected, Main.generateFibonacci(6));
    }

}

