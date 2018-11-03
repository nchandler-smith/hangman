package com.company;

public class LetterTracker {
    private String letters = "";
    private String secretWord ="";
    private int points = 10;

    public  String getLetters() {
        return this.letters;
    }

    public void addLetters(String inputLetter) {
        if (this.letters.length() == 0) {
            this.letters = inputLetter;
        }
        else {
            this.letters += " " + inputLetter;
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
}
