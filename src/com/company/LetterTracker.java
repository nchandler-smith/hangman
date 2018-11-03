package com.company;

public class LetterTracker {
    private String letters = "";

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
}
