package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;


class PhoneBookTest {

    public static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("Мария", "89900324534", 1),
                Arguments.of("Иван", "89880356534", 2),
                Arguments.of("Василий", "89367410845", 3),
                Arguments.of("Мария", "89250759178", 3)
        );
    }
    @ParameterizedTest
    @MethodSource("arguments")
    void add(String name, String phoneNumber, int expected) {
        int result = PhoneBook.add(name, phoneNumber);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByNumber() {
        String result = PhoneBook.findByNumber("89880356534");
        Assertions.assertEquals("Иван", result);
    }

}