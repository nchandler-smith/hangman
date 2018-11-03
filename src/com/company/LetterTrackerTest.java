package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTrackerTest {

    @Test
    void GetLettersReturnsEmptyStringOnInitTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getLetters());
    }

    @Test
    void GetLettersReturnATest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("A");

        assertEquals("A", tracker.getLetters());
    }

    @Test
    void GetLettersReturnBTest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("B");

        assertEquals("B", tracker.getLetters());
    }

    @Test
    void GetLettersReturnABPaddedTest() {
        LetterTracker tracker = new LetterTracker();

        tracker.addLetters("A");
        tracker.addLetters("B");

        assertEquals("A B", tracker.getLetters());
    }

    @Test
    void SecretWordEqualsEmptyStringOnStartTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getSecretWord());
    }

    @Test
    void PlayerStartsWith10PointsTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals(10, tracker.getPoints());
    }

    @Test
    void SecretWordSetToHangmanTest() {
        LetterTracker tracker = new LetterTracker();

        tracker.setSecretWord("Hangman");

        assertEquals("Hangman", tracker.getSecretWord());
    }

    @Test
    void CorrectGuessRemainsAt10PointsTest() {
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        tracker.guessLetter("a");

        assertEquals(10, tracker.getPoints());
    }

    @Test
    void IncorrectGuessLoses1Point() {
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        tracker.guessLetter("z");

        assertEquals(9, tracker.getPoints());
    }

    @Test
    void CorrectGuessGameDoesNotEnd(){
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        tracker.guessLetter("h");

        assertFalse(tracker.getGameIsFinished());
    }
}