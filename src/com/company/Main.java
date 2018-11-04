package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LetterTracker tracker = new LetterTracker();
        WordSelector wordSelector = new WordSelector();

        try {
            wordSelector.loadList("wordlist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        tracker.setSecretWord(wordSelector.getRandomWordFromList());

        System.out.println("You are guessing:" + tracker.getCorrectLetters());
        System.out.println("You have guessed these wrong letters: " + tracker.getGuesses());
        System.out.println("You have " + tracker.getPoints() + " points remaining.");
        System.out.println(tracker.getSecretWord());

        while(!tracker.getGameIsFinished()) {
            System.out.println("Guess a letter: ");
            String guess = scanner.next().substring(0,1);
            tracker.guessLetter(guess);

            System.out.println("You are guessing:" + tracker.getCorrectLetters());
            System.out.println("You have guessed these wrong letters: " + tracker.getGuesses());
            System.out.println("You have " + tracker.getPoints() + " points remaining.");
        }

        if(tracker.getIsWinner()) {
            System.out.println("YOU WON!!!");
        }
        else {
            System.out.println("You lost. Better luck next time." +
                               "\nThe word was " + tracker.getSecretWord() + ".");
        }
    }
}
