package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordSelector {
    private List<String> words = new ArrayList<String>();

    public void loadList(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            this.words.add(scanner.nextLine());
        }
    }

    public List<String> getWords() {
        return this.words;
    }

    public String getRandomWordFromList() {
        Random rand = new Random();
        int randomInteger = rand.nextInt(this.words.size());
        return this.words.get(randomInteger);
    }
}
