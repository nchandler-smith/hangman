package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTrackerTest {

    @Test
    void GetGuessesReturnsEmptyStringOnInitTest() {
        LetterTracker tracker = new LetterTracker();

        assertEquals("", tracker.getGuesses());
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

    @Test
    void GameFinishesWhen0PointsRemain(){
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        for(int i=0; i<10; i++) {
            tracker.guessLetter("z");
        }

        assertTrue(tracker.getGameIsFinished());
    }

    @Test
    void GuesshGeth______(){
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        tracker.guessLetter("h");

        assertEquals("h______", tracker.getCorrectLetters());
    }

    @Test
    void GuessaGet_a___a_(){
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("hangman");

        tracker.guessLetter("a");

        assertEquals("_a___a_", tracker.getCorrectLetters());
    }

    @Test
    void IndicateGameFinishedOnWin(){
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("ab");

        tracker.guessLetter("a");
        tracker.guessLetter("b");
        System.out.println(tracker.getSecretWord());
        System.out.println(tracker.getCorrectLetters());

        assertTrue(tracker.getGameIsFinished());
    }

    @Test
    void IndicateWinnderOnWin() {
        LetterTracker tracker = new LetterTracker();
        tracker.setSecretWord("a");

        tracker.guessLetter("a");

        assertTrue(tracker.getIsWinner());
    }
}