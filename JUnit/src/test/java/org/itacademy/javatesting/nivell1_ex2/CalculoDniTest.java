package org.itacademy.javatesting.nivell1_ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class CalculoDniTest {
    
    @ParameterizedTest
    @MethodSource("data")
    void lletraDNITest(String numero, String lletra){
        CalculoDni calculo = new CalculoDni();
        assertEquals(calculo.lletraDNI(numero),lletra);
    }
    //junit5: usamos stream
    static Stream<Arguments> data() {
        return Stream.of(
            Arguments.of("11111111", "H"),
            Arguments.of("22222222", "J"),
            Arguments.of("33333333", "P"),
            Arguments.of("44444444", "A"),
            Arguments.of("55555555", "K"),
            Arguments.of("66666666", "Q"),
            Arguments.of("77777777", "B"),
            Arguments.of("88888888", "Y"),
            Arguments.of("99999999", "R"),
            Arguments.of("12345678", "Z")
        );
    }
}
