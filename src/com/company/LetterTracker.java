package com.company;

public class LetterTracker {
    private String letters = "";

    public  String getLetters() {
        return this.letters;
    }

    public void addLetters(String inputLetter) {
        this.letters += inputLetter;
    }
}
