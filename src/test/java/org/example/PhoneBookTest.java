package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PhoneBookTest {
    @BeforeEach
    void concatAdd() {
        PhoneBook.add("Мария", "89900324534");
        PhoneBook.add("Иван", "89880356534");
        PhoneBook.add("Василий", "89367410845");
        PhoneBook.add("Мария", "89250759178");
    }
    @Test
    void add() {
        int result = PhoneBook.add("Петя", "89312218990");
        Assertions.assertEquals(4, result);
    }

    @Test
    void findByNumber() {
        String result = PhoneBook.findByNumber("89880356534");
        Assertions.assertEquals("Иван", result);
        Assertions.assertNotNull(result);
    }
    @Test
    void findByName() {
        String result = PhoneBook.findByName("Мария");
        Assertions.assertEquals("89250759178", result);
        Assertions.assertNotNull(result);
    }

}