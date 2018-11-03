package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTrackerTest {

    @Test
    void getLettersReturnsNullOnInitTest() {
        LetterTracker tracker = new LetterTracker();
        String emptyString = "";
        assertEquals(emptyString, tracker.getLetters());
    }


}