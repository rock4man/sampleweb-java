package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testFactorial() {
        assertEquals(120, App.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, App.factorial(0));
    }
}