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
    void getLettersReturnATest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("A");

        assertEquals("A", tracker.getLetters());
    }

    @Test
    void getLettersReturnBTest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("B");

        assertEquals("B", tracker.getLetters());
    }

    @Test
    void getLettersReturnABPaddedTest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("A");
        tracker.addLetters("B");

        assertEquals("A B", tracker.getLetters());
    }

    @Test
    void secretWordEqualsEmptyStringOnStartTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getSecretWord());
    }

    @Test
    void PlayerStartsWith10PointsTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals(10, tracker.getPoints());
    }

}