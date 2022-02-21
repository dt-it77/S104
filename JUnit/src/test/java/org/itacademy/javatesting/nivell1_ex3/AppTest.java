package org.itacademy.javatesting.nivell1_ex3;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void arrayFailTest(){
        App app = new App();
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> app.arrayFail());
    }
}
