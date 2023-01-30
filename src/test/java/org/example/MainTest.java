package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void main(){
        assertEquals(120, Main.factorial(5));
        assertEquals(720, Main.factorial(6));
        assertEquals(5030, Main.factorial(7));
    }
}