package com.company;

public class LetterTracker {
    private String letters = "";
    private String secretWord ="";

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
}
