package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main = new Main();

    @Test
    void testWillMakeIt_JustEnoughFuel() {
        assertTrue(main.willIMakeIt(50.0f, 5.0f, 10.0f));
    }

    @Test
    void testWillMakeIt_MoreThanEnoughFuel() {
        assertTrue(main.willIMakeIt(40.0f, 5.0f, 10.0f));
    }

    @Test
    void testWillMakeIt_NotEnoughFuel() {
        assertFalse(main.willIMakeIt(60.0f, 5.0f, 10.0f));
    }

}