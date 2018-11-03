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

    @Test
    void getLettersReturnA() {
        LetterTracker tracker = new LetterTracker();
        String AString = "A";
        tracker.addLetters("A");
        assertEquals(AString, tracker.getLetters());
    }

    @Test
    void getLettersReturnB() {
        LetterTracker tracker = new LetterTracker();
        String BString = "B";
        tracker.addLetters("B");
    }

}