package com.javareboot;

import com.javareboot.refactoring.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RefactoringDemoTest {

    @Test
    void circleAreaIsCorrect() {
        Shape circle = new Circle(2);
        assertEquals(Math.PI * 4, circle.area());
    }

    @Test
    void squareAreaIsCorrect() {
        Shape square = new Square(3);
        assertEquals(9, square.area());
    }
}

