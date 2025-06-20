package io.stanford.tim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverserTest {

    @Test
    public void testReverseMiddleSubstring() {
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse("abcdefgh", 2, 5);
        assertEquals("abfedcgh", result);
    }

    @Test
    public void testReverseAtStart() {
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse("hello", 0, 2);
        assertEquals("lehlo", result);
    }

    @Test
    public void testReverseAtEnd() {
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse("world", 2, 4);
        assertEquals("wodlr", result);
    }

    @Test
    public void testNoReversalNeeded() {
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse("test", 1, 1);
        assertEquals("test", result);
    }

    @Test
    public void testFullStringReverse() {
        StringReverser reverser = new StringReverser();
        String result = reverser.reverse("12345", 0, 4);
        assertEquals("54321", result);
    }
}