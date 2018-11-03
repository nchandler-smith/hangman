package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretWordTest {

    @Test
    void SecretWordEqualsNullOnInitTest() {
        SecretWord  secretWord = new SecretWord();

        assertEquals(null, secretWord.getWord());
    }

    @Test
    void SecretWordEqualsHangmanTest() {
        SecretWord secretWord = new SecretWord();

        secretWord.setWord("Secret");

        assertEquals("Secret", secretWord.getWord());
    }

}