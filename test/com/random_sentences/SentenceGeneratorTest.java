package com.random_sentences;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SentenceGeneratorTest {

    private String[] article = {"the", "a", "one", "some", "any"};
    private String[] noun = {"boy", "girl", "dog", "town", "car"};
    private String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sentenceTest() {
        SentenceGenerator sentenceGenerator = new SentenceGenerator();
        for (int i = 0; i < 20; i++) {
            System.out.println(sentenceGenerator.generateSentence());
        }
    }
}