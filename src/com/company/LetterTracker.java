package com.company;

public class LetterTracker {
    public boolean gameIsFinished = false;
    private String incorrectLetters = "";
    private String secretWord ="";
    private int points = 10;

    public  String getGuesses() {
        return this.incorrectLetters;
    }

    public void addGuess(String inputLetter) {
        if (this.incorrectLetters.length() == 0) {
            this.incorrectLetters = inputLetter;
        }
        else {
            this.incorrectLetters += " " + inputLetter;
        }
    }

    public String getSecretWord() {
        return this.secretWord;
    }

    public int getPoints() {
        return this.points;
    }

    public void setSecretWord(String wordIn) {
        this.secretWord = wordIn;
    }

    public void guessLetter(String inputLetter) {
        if(this.secretWord.contains(inputLetter)){
        }
        else {
            this.points -= 1;
        }
    }

    public boolean getGameIsFinished() {
        return this.points <= 0;
    }
}
