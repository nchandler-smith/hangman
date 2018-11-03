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
        tracker.addLetters("A");
        assertEquals("A", tracker.getLetters());
    }

    @Test
    void getLettersReturnB() {
        LetterTracker tracker = new LetterTracker();
        String BString = "B";
        tracker.addLetters("B");
        assertEquals(BString, tracker.getLetters());
    }

    @Test
    void getLettersReturnABPadded() {
        LetterTracker tracker = new LetterTracker();
        tracker.addLetters("A");
        tracker.addLetters("B");
        assertEquals("A B", tracker.getLetters());
    }

}