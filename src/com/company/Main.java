package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LetterTracker tracker = new LetterTracker();
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("You are guessing: ");
        tracker.addLetters(consoleScanner.nextLine());
        System.out.println("You have guessed letters: " + tracker.getLetters());

    }
}
