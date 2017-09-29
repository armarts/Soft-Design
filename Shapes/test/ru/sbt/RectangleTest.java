package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rect = new Rectangle(6 , 3);
        assertEquals(6 * 3, rect.area());
    }

}