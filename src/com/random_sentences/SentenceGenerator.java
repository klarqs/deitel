package com.random_sentences;

import java.util.Random;

public class SentenceGenerator {

    private String[] article = {"the", "a", "one", "some", "any"};
    private String[] noun = {"boy", "girl", "dog", "town", "car"};
    private String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] preposition = {"to", "from", "over", "under", "on"};

    public String generateSentence() {
        StringBuilder sentence = new StringBuilder();
        String space = " ";
        Random indexGenerator = new Random();

        // add article
        int index = indexGenerator.nextInt(article.length);
        String word = article[index];

        // Capitalizing first letter
        char firstLetter = Character.toUpperCase(word.charAt(0));
        word = word.replace(word.charAt(0), firstLetter);
        sentence.append(word);
        sentence.append(space);

        // add noun
        index = indexGenerator.nextInt(noun.length);
        word = noun[index];
        sentence.append(word);
        sentence.append(space);

        // add verb
        index = indexGenerator.nextInt(verb.length);
        word = verb[index];
        sentence.append(word);
        sentence.append(space);

        // add preposition
        index = indexGenerator.nextInt(preposition.length);
        word = preposition[index];
        sentence.append(word);
        sentence.append(space);

        // add article
        index = indexGenerator.nextInt(article.length);
        word = article[index];
        sentence.append(word);
        sentence.append(space);

        // add noun
        index = indexGenerator.nextInt(noun.length);
        word = noun[index];
        sentence.append(word);
        sentence.append(space);

        return sentence.toString();
    }
}
