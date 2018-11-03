package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LetterTracker tracker = new LetterTracker();
        Scanner consoleScanner = new Scanner(System.in);
        tracker.setSecretWord("hangman");

        while (!tracker.getGameIsFinished()){
            tracker.guessLetter("p");
        }
    }
}
