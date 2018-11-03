package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTrackerTest {

    @Test
    void getLettersReturnsEmptyStringOnInitTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getLetters());
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

        tracker.addLetters("B");

        assertEquals("B", tracker.getLetters());
    }

    @Test
    void getLettersReturnABPadded() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("A");
        tracker.addLetters("B");

        assertEquals("A B", tracker.getLetters());
    }

    @Test
    void secretWordEqualsEmptyStringOnStart() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getSecretWord());
    }

}