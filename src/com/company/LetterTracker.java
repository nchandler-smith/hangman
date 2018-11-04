package com.company;

public class LetterTracker {
    private boolean gameIsFinished = false;
    private  boolean isWinner = false;
    private String incorrectLetters = "";
    private String secretWord = "";
    private int points = 10;
    private String correctLetters = "";

    public  String getGuesses() {
        return this.incorrectLetters;
    }

    private void addGuess(String inputLetter) {
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
        //this.correctLetters = "_".repeat(this.secretWord.length());
        this.correctLetters = new String(new char[this.getSecretWord().length()]).replace("\0", "_");
    }

    public void guessLetter(String inputLetter) {
        if(this.secretWord.contains(inputLetter)) {
            this.replaceCorrectLetters(inputLetter, 0);
            if (this.getCorrectLetters().equals(this.getSecretWord())) {
                this.gameIsFinished = true;
                this.isWinner = true;
            }
        }
        else {
            this.addGuess(inputLetter);
            this.points -= 1;
        }
    }

    public boolean getGameIsFinished() {
        return this.points <= 0 || this.gameIsFinished;
    }

    public String getCorrectLetters() {
        return this.correctLetters;
    }

    private void replaceCorrectLetters(String inputLetter, int startIndex) {
        int letterIndex = this.secretWord.indexOf(inputLetter, startIndex);
        if(letterIndex >= 0) {
            this.correctLetters = this.correctLetters.substring(0,letterIndex)
                    + inputLetter + this.correctLetters.substring(letterIndex+1);
            this.replaceCorrectLetters(inputLetter, letterIndex+1);
        }
    }

    public boolean getIsWinner() {
        return this.isWinner;
    }
}
