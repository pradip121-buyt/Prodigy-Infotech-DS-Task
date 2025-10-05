package com.prodigy.tasks;

import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import smile.classification.NaiveBayes;
import smile.data.SparseDataset;

public class Task04 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/social_media.csv"));
            System.out.println("Loaded dataset with " + lines.size() + " entries.");
            // Placeholder: Apply sentiment analysis model here
            System.out.println("Perform text preprocessing & train Naive Bayes classifier...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}