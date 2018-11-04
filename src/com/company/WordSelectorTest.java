package com.company;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class WordSelectorTest {

    @Test
    void WordSelectorTest() {
        WordSelector wordSelector = new WordSelector();

        try {
            wordSelector.loadList("shortwordlist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals("first", wordSelector.getWords().get(0));
        assertEquals("second", wordSelector.getWords().get(1));
        assertEquals("third", wordSelector.getWords().get(2));
    }
}